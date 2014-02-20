package com.eoe.se2.day13;

import java.lang.reflect.Field;

public class Test12 {
	static final String PACKAGE="com.eoe.se2.day13.gen.R";
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName(PACKAGE);
			Class<?>[] classes = clazz.getClasses();
			for (Class<?> cls : classes) {
				//System.out.println(cls.getName());
				if(cls.getName().indexOf("id")>=0){
					Field[] fields = cls.getFields();
					for (Field field : fields) {
						int value = Integer.parseInt(field.get(null).toString());
						System.out.println(field.getName()+"=0x"+Integer.toHexString(value));
					}
				}
				if(cls.getName().indexOf("layout")>=0){
					Field[] fields = cls.getFields();
					for (Field field : fields) {
						int value = Integer.parseInt(field.get(null).toString());
						System.out.println(field.getName()+"=0x"+Integer.toHexString(value));
					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
