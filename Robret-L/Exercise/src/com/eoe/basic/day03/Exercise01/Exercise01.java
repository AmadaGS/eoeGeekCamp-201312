package com.eoe.basic.day03.Exercise01;

import java.util.Scanner;

public class Exercise01 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		if(score>=90&&score<=100){
			System.out.println("优秀");
		}else if(score>=80&&score<90){
			System.out.println("良好");
		}else if(score>=70&&score<80){
			System.out.println("中等");
		}else if(score>=60&&score<70){
			System.out.println("及格");
		}else if(score<60&&score>0){
			System.out.println("不及格");
		}else if(score<0 || score>100){
			System.out.println("输入错误");
			return ;
		}
	}
}
