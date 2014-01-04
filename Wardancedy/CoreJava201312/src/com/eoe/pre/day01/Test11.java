package com.eoe.pre.day01;

import java.util.Scanner;

public class Test11 {

	/**
	 * true,false:逻辑值，布尔值
	 * boolean 逻辑类型
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入考试分数:");
		int score=scanner.nextInt();
		boolean pass=score>=60;
		System.out.println("成绩及格:"+(score>=60));
	}

}
