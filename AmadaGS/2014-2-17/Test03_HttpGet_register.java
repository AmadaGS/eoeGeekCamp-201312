package com.eoe.se2_day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.eoe.se2_day10.entity.User;

public class Test03_HttpGet_register {

	static final String BASE_URL="http://localhost:8080/se2_day10_3/Test";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpClient client=new DefaultHttpClient();
		StringBuilder sb=new StringBuilder(BASE_URL);
		sb.append("?name=").append("¡ı–Ò—Ù")
		.append("&id=").append("1002")
		.append("&pwd=").append("1245")
		.append("&phone=").append("5882349")
		.append("&email=").append("lxy@qq.com");
		
		HttpGet get=new HttpGet(sb.toString());
		ObjectInputStream ois=null;
		try {
			HttpResponse response=client.execute(get);
			HttpEntity entity = response.getEntity();
			InputStream in = entity.getContent();
			ois=new ObjectInputStream(in);
			User user = (User) ois.readObject();
			System.out.println(user);
		} catch (ClientProtocolException e) {
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
