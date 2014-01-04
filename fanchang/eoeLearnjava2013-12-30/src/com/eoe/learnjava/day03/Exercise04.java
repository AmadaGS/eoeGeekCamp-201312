package com.eoe.learnjava.day03;
import java.util.Scanner;


public class Exercise04 {

	/**
	 * 编写程序，实现两个字符类型变量值互换
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入两个字符型变量a=");
		char a=scanner.next().charAt(0);
		System.out.println("输入两个字符型变量b=");
		char b=scanner.next().charAt(0);
		a=(char) (a+b);
		b=(char) (a-b);
        a=(char) (a-b);
        System.out.println("a="+a+"   b="+b);
	}

}
