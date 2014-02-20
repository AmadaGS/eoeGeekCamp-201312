package com.eoe.se2.day13;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test11 {
	private static final String PACKAGE="com.eoe.se2.day13.view.Button";
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName(PACKAGE);
			Field onclick = clazz.getDeclaredField("onclick");
			onclick.setAccessible(true);
			int modifiers = onclick.getModifiers();
			String permiss = Modifier.toString(modifiers);
			System.out.println(permiss+" "+onclick.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
