package com.eoe.se2.day10;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.eoe.se2.day10.entity.User;

public class Test04 {

	private static String strUrl="http://localhost:8080/se2_day10_2/Test01";
	private static String ENCODING="utf-8";
	
	public static void main(String[] args) {
		ObjectInputStream ois=null;
		StringBuilder sb=new StringBuilder();
		try {
			sb.append("?name=").append(URLEncoder.encode("张飞",ENCODING));
			sb.append("&pwd=").append("1234");
			URL url=new URL(strUrl+sb.toString());
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(4000);
			conn.setRequestMethod("GET");
			conn.setDoOutput(true);
			InputStream in = conn.getInputStream();
			if(conn.getResponseCode()==200){
				ois=new ObjectInputStream(in);
				User user=(User) ois.readObject();
				if(user==null){
					return;
				}
				System.out.println(user);
				System.out.println("連接成功！");
			}
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(ois!=null){
					ois.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
