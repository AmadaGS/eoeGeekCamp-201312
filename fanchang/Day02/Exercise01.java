package com.eoe.basic.day02;

import java.util.Scanner;

public class Exercise01 {

	/** 编写程序，计算2^n，要求：
	 *	(1)n由键盘输入。
	 *	(2)不能使用Math.pow()
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("2的n次方是（请输入n）：");
			int n=scanner .nextInt();
			System.out.println(+1<<n);     //位左移
	}

}
