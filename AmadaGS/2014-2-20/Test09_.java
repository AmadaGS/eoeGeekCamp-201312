package com.eoe.se2.day13;

public class Test09_ {
	static final String PACKAGE="com.eoe.se2.day13.entity.Mouse";
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName(PACKAGE);
			Class<?>[] interfaces = clazz.getInterfaces();
			for (Class<?> inter : interfaces) {
				System.out.println(inter);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
