package com.eoe.se2_day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;

import com.eoe.se2.day07.download00.Record;

public class Test06 {

	static final String BASE_URL = "http://127.0.0.1/adt.zip";
	static final String FIELNAME = "adt.zip";
	static final String record_FILENAME = "record.dat";
	static final String DEST_PATH = "D:/JAVA_Test/dest/";
	static boolean isContinue = true;
	static final int THREAD_CONUT = 3;
	static Record[] records;

	public static void main(String[] args) {
		final ExecutorService pool = Executors.newFixedThreadPool(THREAD_CONUT+1);
		pool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("按任意键终止下载");
				new Scanner(System.in).next();
				isContinue=false;
				System.out.println("文件被终止！");
				pool.shutdown();
			}
		});
		if(!readRecord()){
			requestServer();
		}
		for (int i = 0; i < records.length; i++) {
			pool.execute(new DownloadTask(i));
		}
	}
	
	static void requestServer(){
		HttpClient client=new DefaultHttpClient();
		HttpGet get=new HttpGet(BASE_URL);
		try {
			HttpResponse response=client.execute(get);
			if(response.getStatusLine().getStatusCode()==200){
				long fileSize=response.getEntity().getContentLength();
				long block=fileSize/THREAD_CONUT;
				for (int i = 0; i <records.length; i++) {
					records[i]=new Record();
					records[i].setStartPos(i*block);
					records[i].setEndPos((i+1)*block-1);
				}
				records[records.length-1].setEndPos(fileSize-1);
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(client!=null){
				client.getConnectionManager().shutdown();
			}
		}
	}
	static class DownloadTask implements Runnable {
		int threadi;

		public DownloadTask(int threadi) {
			super();
			this.threadi = threadi;
		}

		@Override
		public void run() {
			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(BASE_URL);
			Record record = records[threadi];
			long start = record.getStartPos();
			long end = record.getEndPos();
			RandomAccessFile raf = null;
			post.addHeader(new BasicHeader("Range", "bytes=" + start + "-"
					+ end));
			try {
				HttpResponse response = client.execute(post);
				int code = response.getStatusLine().getStatusCode();
				if (code != 200 && code != 206) {
					System.out.println("下載失敗！");
					return;
				}
				raf = new RandomAccessFile(DEST_PATH + FIELNAME, "rw");
				raf.seek(start);
				InputStream in = response.getEntity().getContent();
				int len;
				byte[] buffer = new byte[1024];
				while (start < end && isContinue) {
					len = in.read(buffer);
					raf.write(buffer, 0, len);
					start += len;
					record.setStartPos(start);
				}
				saveRecord();
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (raf != null) {
						raf.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (client != null) {
					client.getConnectionManager().shutdown();
				}
			}
			int count = 0;
			for (int i = 0; i < records.length; i++) {
				if (records[i].getStartPos() >= records[i].getEndPos()) {
					count++;
				}
			}
			if (count == THREAD_CONUT) {
				System.out.println("下载完毕！");
				File file = new File(DEST_PATH + record_FILENAME);
				if (file.exists()) {
					file.delete();
				}
				System.exit(0);
			}
		}
	}

	@SuppressWarnings("null")
	static boolean readRecord() {
		ObjectInputStream ois = null;
		File file = new File(DEST_PATH + record_FILENAME);
		if (!file.exists()) {
			records = new Record[THREAD_CONUT];
			return false;
		}
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			records = (Record[]) ois.readObject();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	static void saveRecord() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(DEST_PATH
					+ record_FILENAME));
			oos.writeObject(records);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
