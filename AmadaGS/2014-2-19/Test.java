package com.eoe.se2.day12_new;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import eoe.se2.day12.User;

public class Test {

	static final String BASE_URL="http://localhost:8080/Sel2day12_new/Test0";
	
	public static void main(String[] args) {
		HttpClient client=new DefaultHttpClient();
		HttpPost post=new HttpPost(BASE_URL);
		ArrayList<BasicNameValuePair> params=new ArrayList<>();
		params.add(new BasicNameValuePair("name", "菲"));
		try {
			post.setEntity(new UrlEncodedFormEntity(params,"utf-8"));
			HttpResponse response=client.execute(post);
			if(response.getStatusLine().getStatusCode()!=200){
				System.out.println("连接服务器失败");
				return;
			}
			InputStream in=response.getEntity().getContent();
			SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
			MyHandler handler = new MyHandler();
			saxParser.parse(in, handler);
			for (User u : handler.users) {
				System.out.println(u);
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
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static class MyHandler extends DefaultHandler{
		ArrayList<User> users;
		User user;
		@Override
		public void startDocument() throws SAXException {
			// TODO Auto-generated method stub
			super.startDocument();
			users=new ArrayList<>();
		}
		
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			super.startElement(uri, localName, qName, attributes);
			if("user".equals(qName)){
				user=new User();
				user.setId(Integer.parseInt(attributes.getValue(0)));
				user.setName(attributes.getValue(1));
				user.setPassword(attributes.getValue(2));
				user.setPhone(attributes.getValue(3));
				user.setEmail(attributes.getValue(4));
				users.add(user);
			}
		}
	}
}
