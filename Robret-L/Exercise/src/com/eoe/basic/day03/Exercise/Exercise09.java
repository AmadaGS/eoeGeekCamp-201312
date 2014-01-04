package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

/**
 * 输入月份，显示该月天数。 要求；不考虑闰年2月份的情况。
 */
public class Exercise09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("month:");
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			System.out.println("28天");
			break;
		default:
			System.out.println("月份输入错误！");
		}

	}
}
