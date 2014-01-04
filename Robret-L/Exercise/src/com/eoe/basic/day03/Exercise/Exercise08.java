package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise08 {
	/**
	 * switch语句示例 键盘输入优、良、中、差，给出对应的分数5、4、3、2
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入优、良、中、差：");
		char grade = scanner.next().charAt(0);
		switch (grade) {
		case '优':
			System.out.println(5);
			break;
		case '良':
			System.out.println(4);
			break;
		case '中':
			System.out.println(3);
			break;
		case '差':
			System.out.println(2);
		default:
			System.out.println("输入的等级错误");
			break;
		// 优秀、良好、中、差
		}
	}
}