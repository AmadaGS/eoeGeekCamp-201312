package com.eoe.se2.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.eoe.se2.day13.view.View;

public class Test08 {

	static final String PACKAGE="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName(PACKAGE);
			Constructor c=clazz.getConstructor(String.class,String.class,String.class,String.class);
			View v=(View) c.newInstance("@+id/view","200","100","ºÚÉ«");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println(field.getName()+":"+field.get(v));
			}
			fields[3].setAccessible(true);
			fields[3].set(v, "×ÏÉ«");
			System.out.println(fields[3].getName()+":"+fields[3].get(v));
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
