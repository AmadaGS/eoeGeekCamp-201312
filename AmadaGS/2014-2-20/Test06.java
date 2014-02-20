package com.eoe.se2.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.eoe.se2.day13.view.View;

public class Test06 {

	static final String PACK="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {
		try {
			Class  clazz = Class.forName(PACK);
			Constructor c=clazz.getConstructor();
			View v = (View) c.newInstance();
			v.setBackground("ºÚÉ«");
			v.setId("@+id/view");
			v.setLayout_height("100");
			v.setLayout_width("200");
			System.out.println(v);
			
			c=clazz.getDeclaredConstructor(String.class);
			c.setAccessible(true);
			v = (View) c.newInstance("ºìÉ«");
			System.out.println(v);
			
			c=clazz.getConstructor(String.class,String.class,String.class,String.class);
			v = (View) c.newInstance("@+id/view","200","300","×ÏÉ«");
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
