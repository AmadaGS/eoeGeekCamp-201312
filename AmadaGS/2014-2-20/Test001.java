package com.eoe.se2.day13;

import java.lang.reflect.Constructor;

public class Test001 {

	static final String PACK="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {

		try {
			Class clazz=Class.forName(PACK);
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
