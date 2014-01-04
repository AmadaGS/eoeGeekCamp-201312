package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise15 {
	/**
	 * 输入考试成绩，若达到60及60分以上，则显示：成绩合格
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入考试成绩：");
		int score = scanner.nextInt();
		if (score >= 60 && score <= 100) {
			System.out.println("成绩合格");
		} else if (score < 60 && score >= 0) {
			System.out.println("成绩不合格");
		} else {
			System.out.println("输入的考试成绩有误！");
		}
	}
}
