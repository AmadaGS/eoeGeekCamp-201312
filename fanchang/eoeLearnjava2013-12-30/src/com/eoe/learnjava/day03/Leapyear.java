package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Leapyear {

	/**已知闰年的条件
	 * 是400的倍数或者是4的倍数但不是100的倍数
	 * 键盘输入年份，显示是闰年还是平年
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入年份：");
		int year = scanner.nextInt();
		if((year%400==0||year%4==0)&&year%100!=0){
			System.out.println("今年是闰年");
		}else{
			System.out.println("今年是平年");
		}
		
		
	}

}
