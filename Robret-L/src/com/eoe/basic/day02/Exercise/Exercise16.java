package com.eoe.basic.day02.Exercise;

public class Exercise16 { 
	public static void main(String[] args) {
		long i=0x20000000000001l;
		double d=i;
		System.out.println(Long.toBinaryString(i));
		System.out.println(Long.toBinaryString((long)d));
	}

}
