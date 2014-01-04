package com.fengleiit.work;

import java.util.Scanner;

/*5、编程，不用判断语句，输入百分制的分数，根据以下标准评定分数等级：
 90～100:优秀
 89-80:良好
 79-70:中等
 69-60:及格
 0－59:不及格*/

public class Exercise005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		AAA: while (true) {
			System.out.println("請輸入分數:");

			int score = scanner.nextInt();
			;
			switch (score / 10) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格！！！");
				continue AAA;
			case 6:
				System.out.println("及格！");
				continue AAA;
			case 7:
				System.out.println("中等！");
				continue AAA;
			case 8:
				System.out.println("良好！");
				continue AAA;
			case 9:
				System.out.println("優秀！");
				continue AAA;
			case 10:
				System.out.println("滿分！！！congratulation！");
				continue AAA;
			default:
				System.out.println("輸入有誤！！！");
				continue AAA;
			}
		}
	}
}
