package com.eoe.se2_day11;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class TestPost {

	static final String BASE_URL="http://localhost:8080/se2_day10_3/Test";
	
	public static void main(String[] args) {
		
		HttpClient client=new DefaultHttpClient();
		HttpPost post=new HttpPost(BASE_URL);
	
		ArrayList<BasicNameValuePair> params=new ArrayList<>();
		params.add(new BasicNameValuePair("id", "1011"));
		params.add(new BasicNameValuePair("name", "»Æ·Éºè"));
		params.add(new BasicNameValuePair("password", "1234"));
		params.add(new BasicNameValuePair("phone", "5667886"));
		params.add(new BasicNameValuePair("email", "hfh@qq.com"));
		try {
			UrlEncodedFormEntity entity=new UrlEncodedFormEntity(params,"utf-8");
			post.setEntity(entity);
			HttpResponse response=client.execute(post);
			if(response.getStatusLine().getStatusCode()==200){
				InputStream in = response.getEntity().getContent();
				byte[] data=new byte[100];
				in.read(data);
				String msg=new String(data, "utf-8");
				System.out.println(msg);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(client!=null){
				client.getConnectionManager().shutdown();
			}
		}
	}

}
