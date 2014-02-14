package com.eoe.se2.day10;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.eoe.se2.day10.entity.User;

public class Test03 {

	static final String BASE_URL="http://localhost:8080/se2_day10_2/Test01";
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("name=").append("øß∑»").append("&pwd=").append("1234");
		HttpURLConnection conn=null;
		ObjectInputStream ois=null;
		User user=null;
		try {
			byte[] data = sb.toString().getBytes("utf-8");
			URL url=new URL(BASE_URL);
			conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length", data.length+"");
			OutputStream out=conn.getOutputStream();
			out.write(data);
			if(conn.getResponseCode()==200){
				ois=new ObjectInputStream(conn.getInputStream());
				user=(User) ois.readObject();
				System.out.println(user);
			}else{
				System.out.println("ﬂBΩ” ßî°£°");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(user);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(ois!=null){
					ois.close();
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
