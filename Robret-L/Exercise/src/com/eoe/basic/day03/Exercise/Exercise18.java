package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise18 {
	/**
	 * 键盘输入java、android和oracle三科分数，找出其中最高分。
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入java、android、oracle三科分数：");
		int java = scanner.nextInt();
		int android = scanner.nextInt();
		int oracle = scanner.nextInt();
		if (java > android && java > oracle) {
			System.out.println("最高分是：" + java);
		} else if (android > oracle) {
			System.out.println("最高分是：" + android);
		} else {
			System.out.println("最高分是：" + oracle);
		}
	}
}
