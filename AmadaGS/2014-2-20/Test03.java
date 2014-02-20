package com.eoe.se2.day13;

import com.eoe.se2.day13.view.View;

public class Test03 {
	
	public static void main(String[] args) {
		
		View v = new View();
		System.out.println(v);
		System.out.println(View.class);
		//System.out.println(v.getClass());
		Class clazz1 = v.getClass();
		try {
			Class clazz=Class.forName("com.eoe.se2.day13.view.View");
			System.out.println(clazz);
			System.out.println(clazz==clazz1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
