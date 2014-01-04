package Exercise06_;

import java.util.Scanner;

public class Exercise03 {
	/**
	 * 不用判断语句，输入月份，显示天数，考虑闰年2月份的情况。
	 */
	public static void main(String[] args) {
		int[] a = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入月份：");
		int month = scanner.nextInt();
		System.out.println("输入年份：");
		int year = scanner.nextInt();
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("闰年:");
			a[1]=28;
			System.out.println(a[month - 1]+"天");
		} else {
			System.out.println("平年：");
			System.out.println(a[month - 1]+"天");
		}

	}


}
