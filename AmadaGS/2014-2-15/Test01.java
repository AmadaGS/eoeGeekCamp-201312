package com.eoe.se2.day12_;

import java.awt.Component.BaselineResizeBehavior;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test01 {

	private static String BASE_URL="http://localhost:8080/sel2day12/Test";
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		sb.append("name=").append("„ΆΠρκ–")
		.append("&pwd=").append("1234324")
		.append("&id=").append("1001")
		.append("&phone=").append("5667882")
		.append("&email=").append("gs@qq.com");
		HttpURLConnection conn=null;
		BufferedReader reader=null;
		
		try {
			URL url=new URL(BASE_URL);
			byte[] data=sb.toString().getBytes("utf-8");
			conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(4000);
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length", data.length+"");
			conn.getOutputStream().write(data);
			if(conn.getResponseCode()==200){
				System.out.println(conn.getResponseCode());
				System.out.println(conn.getResponseMessage());
				reader=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
				System.out.println(reader.readLine());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
