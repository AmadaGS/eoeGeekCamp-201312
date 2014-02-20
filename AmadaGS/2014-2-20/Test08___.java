package com.eoe.se2.day13;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test08___ {

	static final String PACKAGE="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {
	try {
		Class clazz=Class.forName(PACKAGE);
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field);
		}
		System.out.println("*****");
	   Method[] methods = clazz.getDeclaredMethods();
	   for (Method method : methods) {
		   method.setAccessible(true);
		System.out.println(method);
	}
	   System.out.println("***");
	  Method m= clazz.getDeclaredMethod("getCount",null);
	   m.setAccessible(true);
	   int n = (int) m.invoke(null, null);
	   System.out.println("View类的属性有"+n+"个");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
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
