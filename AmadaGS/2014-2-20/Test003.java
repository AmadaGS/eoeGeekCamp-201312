package com.eoe.se2.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.eoe.se2.day13.view.View;

public class Test003 {

	static final String PACK="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args){
		try {
			Class clazz=Class.forName(PACK);
			Constructor c=clazz.getConstructor(String.class,String.class,String.class,String.class);
			View v=(View) c.newInstance("@+id/people","200","100","ºÚÉ«");
			System.out.println(v);
			
			c=clazz.getConstructor();
			v=(View) c.newInstance();
			v.setBackground("À¶É«");
			v.setId("@+id/apple");
			v.setLayout_height("300");
			System.out.println(v);
			
			c=clazz.getDeclaredConstructor(String.class);
			c.setAccessible(true);
			v = (View) c.newInstance("200");
			v.setId("20");
			System.out.println(v);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
