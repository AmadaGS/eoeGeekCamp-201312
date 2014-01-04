package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise10 {/*
						 * 键盘输入一个整数，再输入一个字符，该字符是+、-、*或/四个字符中的
						 * 任意一个，再输入一个整数。程序根据输入的运算符，对两个整数进行相应 的计算。 例如：输入5 *
						 * 4,则程序将显示5+4的结果9.若输入的运算符不是以上字符，则显示 运算符输入错误。
						 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("a [+,-,*,/,%] b=");
		int a = input.nextInt();
		char c = input.next().charAt(0);
		int b = input.nextInt();
		System.out.println("" + a + c + b + "=");
		switch (c) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		case '%':
			System.out.println("a%b");
		default:
			System.out.println("不能进行四则运算");

		}
	}

}
