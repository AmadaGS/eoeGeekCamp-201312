package com.eoe.pre.day01;

import java.util.Scanner;

public class Test09 {

	/**
	 * switch()：开关语句
	 * 只能处理int或char类型的变量的多种可能值.jdk1.6
	 * jdk1.7:switch能处理String类型。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入5分制的分数:");
		int score=scanner.nextInt();
		switch (score) {
		case 5:
			System.out.println("优");
			break;
		case 4:
			System.out.println("良");
			break;
		case 3:
			System.out.println("及格");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
		default:
			System.out.println("输入错误!");
			break;
		}
	}
	//siwtch会面的命令
}
