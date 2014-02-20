package com.eoe.se2.day13;

public class Test10 {
	static final String PACKAGE="com.eoe.se2.day13.view.EditText";
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName(PACKAGE);
			System.out.println(clazz);
			do{
				clazz=clazz.getSuperclass();
				System.out.println(clazz);
			}while(clazz!=Object.class);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
