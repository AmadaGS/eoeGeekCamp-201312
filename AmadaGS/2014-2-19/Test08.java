package com.eoe.se2.day12_new;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Test08 {

	static final String SRC_PATH="D:/JAVA_Test/se2_day12/";
	static final String FILENAME="activity_main.xml";
	static LinearLayout layout;
	static ListView listView;
	
	public static void main(String[] args) {
		InputStream in=null;
		try {
			SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
			in=new FileInputStream(SRC_PATH+FILENAME);
			saxParser.parse(in, new MyHandler());
			System.out.println(layout);
			System.out.println(listView);
			System.out.println("<LinearLayout/>");
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static class MyHandler extends DefaultHandler{
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			super.startElement(uri, localName, qName, attributes);
			if("LinearLayout".equals(qName)){
				layout=new LinearLayout();
				layout.name=qName;
				layout.xmlns=attributes.getValue(0);
				layout.orientation=attributes.getValue(1);
				layout.layout_width=attributes.getValue(2);
				layout.layout_height=attributes.getValue(3);
			}else if("ListView".equals(qName)){
				listView=new ListView();
				listView.name=qName;
				listView.id=attributes.getValue(0);
				listView.layout_height=attributes.getValue(1);
				listView.layout_width=attributes.getValue(2);
			}
		}
	}
	
	static class LinearLayout{
		String name;
		String xmlns;
		String orientation;
		String layout_width;
		String layout_height;
		
		public LinearLayout() {
			// TODO Auto-generated constructor stub
		}
		
		public LinearLayout(String name, String xmlns, String orientation,
				String layout_width, String layout_height) {
			super();
			this.name = name;
			this.xmlns = xmlns;
			this.orientation = orientation;
			this.layout_width = layout_width;
			this.layout_height = layout_height;
		}
		@Override
		public String toString() {
			String space="    ";
			return "<"+name+"\n"+
			       space+"xmlns:android=\""+xmlns+"\"\n"+
			       space+"android:orientation=\""+orientation+"\"\n"+
			       space+"android:layout_width=\""+layout_width+"\"\n"+
			       space+"android:layout_height=\""+layout_height+"\">";
		}
	}
	
	static class ListView{
		String name;
		String id;
		String layout_width;
		String layout_height;
		
		public ListView() {
			// TODO Auto-generated constructor stub
		}

		public ListView(String name, String id, String layout_width,
				String layout_height) {
			super();
			this.name = name;
			this.id = id;
			this.layout_width = layout_width;
			this.layout_height = layout_height;
		}
		
		@Override
		public String toString() {
			String space="    ";
			
			return space+"<"+name+"\n"+
		           space+space+"android:id=\""+id+"\"\n"+
		           space+space+"android:layout_width=\""+layout_width+"\"\n"+
		           space+space+"android:layout_height=\""+layout_height+"\">";
			}
	}

}
