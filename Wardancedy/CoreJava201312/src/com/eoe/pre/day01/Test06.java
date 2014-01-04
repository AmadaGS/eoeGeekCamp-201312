package com.eoe.pre.day01;

import java.util.Scanner;

public class Test06 {

	/**
	 * ctlr+/:快速注释所选代码
	 */
	public static void main(String[] args) {
		//键盘输入语句
//		int score=60;
//		System.out.println("score="+score);
		//创建一个用于键盘输入的对象
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入分数:");
		int score=scanner.nextInt();
		if(score>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		/*
		 *   表达式1 < 表达式2   :小于运算
		 *   表达式1 > 表达式2   :大于运算
		 *   表达式1 <= 表达式2   :小于等于运算
		 *   表达式1 >= 表达式2   :大于等于运算
		 *   表达式1 == 表达式2   :等于运算
		 *   表达式1 != 表达式2   :不等于运算
		 */
	}

}
