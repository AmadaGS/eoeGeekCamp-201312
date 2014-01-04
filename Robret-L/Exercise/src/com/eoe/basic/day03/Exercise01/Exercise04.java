package com.eoe.basic.day03.Exercise01;

import java.util.Scanner;

public class Exercise04 {
	/**
	 * 每页10行，输入需要显示的行数，计算需要显示的页数
	 */
	public static void main(String[] args) {
		//设变量line为行数，变量page为页数
		int page;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入行数：");
		int line=scanner.nextInt();
		if(line%10==0){
		System.out.println(" page="+line/10);
		}else {
			System.out.println(" page="+(line/10+1));
		return;
			
		}
		
	}



}
