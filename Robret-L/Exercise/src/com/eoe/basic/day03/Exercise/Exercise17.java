package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise17 {
	/**
	 * 键盘输入5分制分数，根据以下标准给出成绩等级 5分：优秀 4分：良好 3分：及格 0～2分：不及格
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个五分制分数：");
		int score = scanner.nextInt();
		if (score < 0 || score > 5) {
			System.out.println("输入错误！");
			return;
		}
		if (score == 5) {
			System.out.println("优秀");
		} else if (score == 4) {
			System.out.println("良好");
		} else if (score == 3) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

	}
}
