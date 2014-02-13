package com.eoe.se2.day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
//从HFS服务器读取user.txt文件并在控制台打印该文件内容。
public class Test01 {

	public static void main(String[] args) {
		BufferedReader reader=null;
		try {
			URL url=new URL("http://127.0.0.1/user.txt");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(3000);
			conn.setRequestMethod("GET");
			InputStream in=conn.getInputStream();
			if(conn.getResponseCode()!=200){
				System.out.println(conn.getResponseCode());
				return;
			}
			reader=new BufferedReader(new InputStreamReader(in));
			String line;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
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
	}
}
