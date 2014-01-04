package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise14 {
	/**
	 * 键盘输入一个5分制分数，用非运算计算并显示该数是否为554safs
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个五分制分数：");
		int score = scanner.nextInt();
		boolean isScore = !(score < 0 || score > 5);
		System.out.println("五分制分数：" + isScore);
	}
}
