package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise06 {
	/**
	 * switch语句示例
	 * 键盘输入一个5分制的分数，根据以下评分标准给出成绩的等级
	 * 5分：优秀
	 * 4分：良好
	 * 3分：及格
	 * 0～2：不及格
	 */
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("输入5分制的分数");
		 int score=scanner.nextInt();
		 switch (score) {
		case 5:
			System.out.println("优秀");
			break;
		case 4:
			System.out.println("良好");
			break;
		case 3:
			System.out.println("及格");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
		default:
			System.out.println("输入的不是5分制的分数");
			break;
		}

	}
}


