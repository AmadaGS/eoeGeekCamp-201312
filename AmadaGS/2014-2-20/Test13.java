package com.eoe.se2.day13;

import java.lang.reflect.Array;

public class Test13 {
	public static void main(String[] args) {
		String[] names=new String[4];
		createArray(names,names.length,"уе╥и");
		Integer[] scores=new Integer[10];
		createArray(scores,scores.length,98);
		
	}

	private static <T> void createArray(T[] ary, int length, T value) {
		Class<?> type = ary.getClass().getComponentType();
		T[] array=(T[]) Array.newInstance(type, length);
//		Array.set(array, 2, value);
//		System.out.println(Array.get(array, 2));
		Array.set(array, 1, value);
		System.out.println(Array.get(array, 1));
		
		
	}
}
	
	
