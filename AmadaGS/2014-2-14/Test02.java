package com.eoe.se2.day10;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test02 {

	static final String BASE_URL="http://localhost:8080/se2_day10/Test01";
	
	public static void main(String[] args) {
		HttpURLConnection conn=null;
		try {
			URL url=new URL(BASE_URL);
			conn=(HttpURLConnection) url.openConnection();
			StringBuilder sb=new StringBuilder();
			sb.append("name=").append("¸ßÉº").append("&age=").append(23);
			byte[] data = sb.toString().getBytes("utf-8");
			conn.setConnectTimeout(5000);
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length", data.length+"");
			conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			OutputStream out=conn.getOutputStream();
			out.write(data);
			if(conn.getResponseCode()!=200){
				System.out.println(conn.getResponseMessage());
				return;
			}
			
			
			System.out.println("°lËÍ”µ“þ³É¹¦£¡");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
