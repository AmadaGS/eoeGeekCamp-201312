package com.eoe.basic.day02;

import java.util.Scanner;

public class Exercise03 {

	/**
	 * 编写程序，不用第三个变量，用减法实现两个变量值互换。
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入a=");
			int a = scanner.nextInt();
			System.out.println("请输入b=");
			int b = scanner.nextInt();
			a=a-b;
			b=a+b;
			a=b-a;
			System.out.println("交换后的a="+a+"    b="+b);

	}

}
