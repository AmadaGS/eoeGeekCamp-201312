package com.eoe.se2_day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.eoe.se2_day10.entity.User;

public class Test03 {

	static final String BASE_URL="http://localhost:8080/se2_day10_3/Test";
	
	public static void main(String[] args) {
		HttpClient client=new DefaultHttpClient();
		StringBuilder sb=new StringBuilder(BASE_URL);
		sb.append("?name=").append("¸ßÉº")
		.append("&id=").append("1001")
		.append("&pwd=").append("1234")
		.append("&phone=").append("5667886")
		.append("&email=").append("gs@qq.com");
		
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
			// TODO Auto-generated catch bslock
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
