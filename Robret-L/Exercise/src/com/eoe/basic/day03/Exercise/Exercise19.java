package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise19 {
	/**
	 * 键盘输入java、android和oracle三科分数，找出其中最高分。 解法2-选择法
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("java android oracle:");
		int java = scanner.nextInt();
		int android = scanner.nextInt();
		int oracle = scanner.nextInt();
		int max = java;
		if (max < android) {
			max = android;
		}
		if (max < oracle) {
			max = oracle;
		}
		System.out.println("最高分：" + max);
	}
}
