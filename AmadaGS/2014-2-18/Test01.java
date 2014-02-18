package com.eoe.se2.day12_new;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.eoe.se2.day12.entity.User;

public class Test01 {

	static final String SRC_PATH="D:/JAVA_Test/se2_day12/";
	static final String FILENAME="users1.xml";
	
	public static void main(String[] args) {
		InputStream in=null;
		ArrayList<User> users=null;
		User user=null;
		try {
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			XmlPullParser parser = factory.newPullParser();
			in=new FileInputStream(SRC_PATH+FILENAME);
			parser.setInput(in, "utf-8");
			for (int type =parser.next(); 
					type != XmlPullParser.END_DOCUMENT;
					type=parser.next()) {
				switch (type) {
				case XmlPullParser.START_TAG:
					String tag=parser.getName();
					if("users".equals(tag)){
						users=new ArrayList<>();
					}else if("user".equals(tag)){
						user=new User();
						int id=Integer.parseInt(parser.getAttributeValue(0));
						user.setId(id);
					}else if("name".equals(tag)){
						user.setName(parser.nextText());
					}else if("password".equals(tag)){
						user.setPwd(parser.nextText());
					}else if("phone".equals(tag)){
						user.setPhone(parser.nextText());
					}else if("email".equals(tag)){
						user.setEmail(parser.nextText());
					}
					break;
				case XmlPullParser.END_TAG:
					if("user".equals(parser.getName())){
						users.add(user);
					}else if("users".equals(parser.getName())){
						for (User user2 : users) {
							System.out.println(user2);
						}
					}
					break;
				}
			}
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(in!=null){
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
