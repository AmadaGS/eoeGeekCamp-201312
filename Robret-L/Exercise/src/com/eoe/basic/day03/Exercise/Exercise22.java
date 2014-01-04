package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise22 {
	/**
	 * 三目运算案例：实现两个布尔变量值互换(不借助第三变量)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入两个逻辑变量值：");
		boolean a = scanner.nextBoolean();
		boolean b = scanner.nextBoolean();
		System.out.println("a=" + a + "/tb=" + b);
		a = a != b ? !(b = a) : a;
		System.out.println("a=" + a + "/tb=" + b);
	}
}
