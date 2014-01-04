package com.eoe.basic.day03.Exercise01;

import java.util.Scanner;

public class MyMath {
	
	public static void main(String[] args) {
		isleapYear(args);
	}
	public static void isleapYear(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入年份:");
		int year=scanner.nextInt();
		if(year%400==0 || year%4==0&&year%100!=0){
	    System.out.println("闰年");
		}else{
			System.out.println("平年");
			
		}
		
		
	}


}
