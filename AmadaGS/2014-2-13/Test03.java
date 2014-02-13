package com.eoe.se2.day09;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class Test03 {

	private static final String BASE_URL="http://127.0.0.1/";
	private static final String FILENAME="eclipse-SDK-3.5.2-win32.zip";
	private static final String DEST_PATH="D:/JAVA_Test/dest/";
	private static final String RECORD_FILENAME="record.dat";
	static boolean isContinue=true;
	
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("按任意键终止下载！");
				new Scanner(System.in).next();
				isContinue=false;
			};
		}.start();
		RandomAccessFile raf=null;
		try {
			URL url=new URL(BASE_URL+FILENAME);
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(3000);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			long position=readPosition();
			conn.setRequestProperty("range", "bytes="+position);
			InputStream in=conn.getInputStream();
			raf=new RandomAccessFile(DEST_PATH+FILENAME, "rw");
			raf.seek(position);
			byte[] buffer=new byte[1024];
			int len;
			while((len=in.read(buffer))!=-1&&isContinue){
				raf.write(buffer, 0, len);
				position+=len;
			}
			if(!isContinue){
				savePosition(position);
				System.out.println(FILENAME+"下载被终止！");
			}else{
				System.out.println(FILENAME+"下载完成");
				File file=new File(DEST_PATH+RECORD_FILENAME);
				if(file.exists()){
					file.delete();
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
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

	}
	static void savePosition(long position){
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(DEST_PATH+RECORD_FILENAME));
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
	static long readPosition(){
		DataInputStream dis=null;
		long position=0;
		try {
			File file=new File(DEST_PATH+RECORD_FILENAME);
			if(!file.exists()){
				return 0;
			}
			dis=new DataInputStream(new FileInputStream(file));
			position=dis.readLong();
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
		return position;
	}
}
