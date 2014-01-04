package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise21 {
	/**
	 * 用三目运算判断奇偶数。
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个正数：");
		int i = input.nextInt();
		String message = i % 2 == 0 ? "偶数" : "奇数";
		System.out.println(message);

	}
}
