package com.eoe.se2_day11;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class Test04 {

	static final String BASE_URL="http://localhost:8080/se2_day10/Test01";
	
	public static void main(String[] args) {
		HttpClient client=new DefaultHttpClient();
		HttpPost post=new HttpPost(BASE_URL);

		ArrayList<BasicNameValuePair> params=new ArrayList<>();
		params.add(new BasicNameValuePair("name","≈À‘∆ø≠"));
		params.add(new BasicNameValuePair("age", "34"));
		try {
			HttpEntity entity=new UrlEncodedFormEntity(params,"utf-8");
			post.setEntity(entity);
			HttpResponse response=client.execute(post);
			System.out.println(response.getStatusLine().getStatusCode());
			System.out.println(response.getStatusLine().getReasonPhrase());
			
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
