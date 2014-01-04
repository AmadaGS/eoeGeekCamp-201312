package com.eoe.exam;

import java.util.Scanner;

public class Examination02 {
	/**
	 * 键盘输入5分制分数，显示：优、良、及格或不及格。要求不能用任何判断语句。
	 * @param args
	 */
	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   String [] a={"不及格","不及格","及格","良","优"};
	   System.out.println("输入一个五分制分数：");
	   int n=scanner.nextInt();
	   System.out.println(a[n-1]);
	}


}
