package com.eoe.basic.day03.Exercise01;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入月份：");
		int month=scanner.nextInt();
		switch(month){
		default:
			System.out.println("月份输入错误");
			break;
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
		case 2:
		System.out.println("输入年份");
		int year=scanner.nextInt();
		if(year%400==0 || year%4==0&&year%100!=0){
			System.out.println("闰年");
			System.out.println("29天");
		}else{
			System.out.println("平年");
			System.out.println("28天");
		
		
		}
		
	}
	}


}
