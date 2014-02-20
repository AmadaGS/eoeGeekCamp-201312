package com.eoe.se2.day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test08_ {

	static final String PACKAGE="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {
	try {
		Class clazz=Class.forName(PACKAGE);
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("******");
		Method[] methods2 = clazz.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		System.out.println("*******");
		Method getCount=clazz.getDeclaredMethod("getCount", null);
		getCount.setAccessible(true);
		int count = (int) getCount.invoke(null, null);
		System.out.println("View类的属性有"+count+"个");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
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
