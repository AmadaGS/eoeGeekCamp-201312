package com.eoe.se2.day13;

import java.lang.reflect.Field;

public class Test07 {

	static final String PACKAGE="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {
		
		try {
			Class clazz=Class.forName(PACKAGE);
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println(field);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
