package com.eoe.pre.day01;

import java.util.Scanner;

public class Test07 {

	/** 张飞
	 * @param args男
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("name=");
		String name=scanner.next();
		System.out.println("sex=");
		char sex=scanner.next().charAt(0);
		System.out.println("age=");
		int age=scanner.nextInt();
		System.out.println("height=");
		double height=scanner.nextDouble();
		System.out.println("嗨，大家好,俺叫"+name+
			",今年"+age+"岁,身高"+height+"米，俺是一个"+sex+"士");
		
	}

}
