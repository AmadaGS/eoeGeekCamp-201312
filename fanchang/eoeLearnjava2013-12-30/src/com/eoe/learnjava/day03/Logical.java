package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Logical {

	/**键盘输入一个五分制分数，用与运算计算并显示该数是否属于五分制分数
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入一个五分制的分数：");
//		int score = scanner.nextInt();
//		boolean isScore=score>=0 && score <=5;
//		System.out.println("五分制分数："+isScore);
		//另一种逻辑
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个五分制的分数：");
		int score = scanner.nextInt();
		boolean isnotScore=!(score<0 || score>5);
		System.out.println("五分制分数："+isnotScore);
	}

}
