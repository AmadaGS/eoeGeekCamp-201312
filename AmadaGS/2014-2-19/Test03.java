package com.eoe.se2.day12_new;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import com.eoe.se2.day008.entity.User;


public class Test03 {

	static final String DEST_PATH="D:/JAVA_Test/se2_day12/";
	static final String FILENAME="users3.xml";
	
	public static void main(String[] args) {
		ArrayList<User> users=initUsers();
	    PrintWriter writer=null;
	    try {
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			XmlSerializer serializer = factory.newSerializer();
			writer=new PrintWriter(DEST_PATH+FILENAME);
			serializer.setOutput(writer);
			serializer.startDocument("utf-8", null);
			serializer.text("\n");
			serializer.startTag(null, "users");
			for (User user : users) {
				serializer.text("\n");
				serializer.startTag(null, "user");
				serializer.attribute(null, "id", user.getId()+"");
				
				serializer.text("\n");
				serializer.text("  ");
				serializer.startTag(null, "name");
				serializer.text(user.getName());
				serializer.endTag(null, "name");
				
				
				serializer.text("\n");
				serializer.text("  ");
				serializer.startTag(null, "password");
				serializer.text(user.getPwd());
				serializer.endTag(null, "password");
				
				serializer.text("\n");
				serializer.text("  ");
				serializer.startTag(null, "phone");
				serializer.text(user.getPhone());
				serializer.endTag(null, "phone");
				
				serializer.text("\n");
				serializer.text("  ");
				serializer.startTag(null, "email");
				serializer.text(user.getMobile());
				serializer.endTag(null, "email");
				serializer.text("\n");
				
				serializer.endTag(null, "user");
			}
			serializer.endTag(null, "users");
			serializer.endDocument();
			System.out.println(FILENAME+"…˙≥…ÕÍ±œ£°");
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
		}
	}

	private static ArrayList<User> initUsers() {
		ArrayList<User> list=new ArrayList<>();
		User user=new User(1000, "∏ﬂ…∫", "1234", "5667886", "gs@qq.com");
		list.add(user);
		list.add(new User(1001, "¡ı…∫", "1234", "5667886", "gs@qq.com"));
		list.add(new User(1002, "Õı…∫", "1234", "5667886", "gs@qq.com"));
		list.add(new User(1003, "’‘…∫", "1234", "5667886", "gs@qq.com"));
		list.add(new User(1004, "ˆŒ…∫", "1234", "5667886", "gs@qq.com"));
		return list;
	}

}

