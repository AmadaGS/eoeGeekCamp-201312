package com.eoe.se2_day11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;

public class Test0_Download {

	static final String BASE_URL = "http://127.0.0.1/adt.zip";
	static final String FILENAME = "adt.zip";
	static final String DEST_PATH = "D:/JAVA_Test/dest/";
	static final String RECORD_NAME = "record.dat";
	static boolean isContinue = true;

	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("���������ֹ����");
				new Scanner(System.in).next();
				isContinue=false;
			};
		}.start();
		long position=readPosition();
		HttpClient client=new DefaultHttpClient();
		HttpPost post=new HttpPost(BASE_URL);
		post.addHeader(new BasicHeader("Range", "bytes="+position+"-"));
		RandomAccessFile raf=null;
		try {
			HttpResponse response=client.execute(post);
			int code=response.getStatusLine().getStatusCode();
			if(code!=200&&code!=206){
				System.out.println("����ʧ��");
				return ;
			}
			InputStream in=response.getEntity().getContent();
			raf=new RandomAccessFile(DEST_PATH+FILENAME, "rw");
			raf.seek(position);
			int len;
			byte[] buffer=new byte[1024*20];
			while((len=in.read(buffer))!=-1&&isContinue){
				raf.write(buffer,0,len);
				position+=len;
			}
			if(!isContinue){
				savePosition(position);
				System.out.println("��������ֹ");
			}else{
				System.out.println("������ɣ�");
				File  file=new File(DEST_PATH+RECORD_NAME);
				if(file.exists()){
					file.delete();
				}
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(raf!=null){
					raf.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if(client!=null){
			client.getConnectionManager().shutdown();
		}
		
	}

	static long readPosition() {
		DataInputStream dis = null;
		File file = new File(DEST_PATH + RECORD_NAME);
		if (!file.exists()) {
			return 0;
		}
		try {
			dis = new DataInputStream(new FileInputStream(file));
			long position = dis.readLong();
			return position;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dis!=null){
					dis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	static void savePosition(long position) {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(DEST_PATH
					+ RECORD_NAME));
			dos.writeLong(position);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
