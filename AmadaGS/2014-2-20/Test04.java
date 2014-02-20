package com.eoe.se2.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test04 {

	static final String PACKAGE="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {

     try {
		Class clazz = Class.forName("com.eoe.se2.day13.view.View");
		//��ȡpublic ���͵Ĺ��췽��
		Constructor[] c = clazz.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
		System.out.println("***********");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor cc : constructors) {
			System.out.println(cc);
		}
		System.out.println("*******");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
