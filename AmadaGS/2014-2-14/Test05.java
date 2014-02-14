package com.eoe.se2.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Test05 {

	private static String BASE_URL="http://localhost:8080/se2_day10_3/Test";
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("name=").append("¸ß³¬")
		.append("&id=").append("3333")
		.append("&pwd=").append("123456")
		.append("&phone=").append("55667886")
		.append("&email=").append("gs@qq.com");
		HttpURLConnection conn=null;
		BufferedReader reader=null;
		
		try {
			byte[] data=sb.toString().getBytes("utf-8");
			URL url=new URL(BASE_URL);
			conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length",data.length+"");
			conn.getOutputStream().write(data);
			
			if(conn.getResponseCode()==200){
				System.out.println(conn.getResponseCode());
				reader=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
				System.out.println(reader.readLine());
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			conn.disconnect();
		}
	}
}
