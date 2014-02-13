package com.eoe.se2.day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test02 {

	private static final String BASE_URL="http://127.0.0.1/";
	private static final String FILENAME="eclipse-SDK-3.5.2-win32.zip";
	private static final String DEST_PATH="D:/JAVA_Test/dest/";
	
	
	public static void main(String[] args) {
		FileOutputStream fos=null;
		HttpURLConnection conn =null;
		try {
			URL url=new URL(BASE_URL+FILENAME);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(3000);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			InputStream in=conn.getInputStream();
			fos=new FileOutputStream(DEST_PATH+FILENAME);
			byte[] buffer=new byte[1024];
			int  len;
			System.out.println("开始下载！");
			while((len=in.read(buffer))!=-1){
				fos.write(buffer, 0, len);
			}
			System.out.println("FILENAME+:下载完毕！");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
				if(conn!=null){
					conn.disconnect();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
