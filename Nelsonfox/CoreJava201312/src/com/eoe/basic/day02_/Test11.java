package com.eoe.basic.day02_;

public class Test11 {
	public static void main(String[] args) {
		//int����ת��Ϊfloat
		int i=0x2000001;
		float f=i;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString((int)f));
	}
}
