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

public class Test003 {

	static final String BASE_URL = "http://127.0.0.1/adt.zip";
	static final String FIELNAME = "adt.zip";
	static final String record_FILENAME = "record.dat";
	static final String DEST_PATH = "D:/JAVA_Test/dest/";
	static boolean isContinue = true;
	
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				System.out.println("按任意键终止下载！");
				new Scanner(System.in).next();
				isContinue=false;
				System.out.println(FIELNAME+"下載被終止！");
			}
		}.start();
		long position=readPosition();
		HttpClient client=new DefaultHttpClient();
		HttpPost post=new HttpPost(BASE_URL);
		post.addHeader(new BasicHeader("Range","bytes="+position+"-"));
		RandomAccessFile raf=null;
		try {
			HttpResponse response=client.execute(post);
			int code=response.getStatusLine().getStatusCode();
			if(code!=200&&code!=206){
				System.out.println("下载失败！");
				return ;
			}
			raf=new RandomAccessFile(DEST_PATH+FIELNAME, "rw");
			raf.seek(position);
			InputStream in = response.getEntity().getContent();
			int len;
			byte[] buffer=new byte[1024*10];
			while((len=in.read(buffer))!=-1&&isContinue){
				raf.write(buffer, 0, len);
				position+=len;
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
		}
		if(client!=null){
			 client.getConnectionManager().shutdown();
		}
		if(!isContinue){
			savePosition(position);
		}else{
			System.out.println(FIELNAME+"下載完畢！");
			File  file=new File(DEST_PATH+record_FILENAME);
			if(file.exists()){
				file.delete();
			}
			System.exit(0);
		}
	}
	
	static long readPosition(){
		DataInputStream dis=null;
		File file=new File(DEST_PATH+record_FILENAME);
		if(!file.exists()){
			return 0;
		}
		try {
			dis=new DataInputStream(new FileInputStream(file));
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
	static void savePosition(long position){
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(DEST_PATH+record_FILENAME));
			dos.writeLong(position);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dos!=null){
					dos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
