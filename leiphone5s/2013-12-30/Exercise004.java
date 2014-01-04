package com.fengleiit.work;

import java.util.Scanner;

/*4、不用判断语句，输入月份，显示天数，考虑闰年2月分的情况。
 文件名：Exercise03.java*/
public class Exercise004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入月份:");
		int month = scanner.nextInt();
		System.out.println("請輸入年份:");
		int year = scanner.nextInt();
		int[] a = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month != 2)
			System.out.println(a[month - 1] + "天");
		else {

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(a[month - 1] + "天");
			} else {				
				System.out.println(28 + "天");
			}

		}
	}
}
