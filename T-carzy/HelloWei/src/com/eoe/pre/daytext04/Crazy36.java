package com.eoe.pre.daytext04;
/*
 * *7、由人通过键盘输入一个0～99之间的整数，
 * 让电脑用二分查找法找到该数。
文件名：Exercise06.java  
 */
import java.util.Scanner;
public class Crazy36 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入要猜的数：");
		int guessed=scanner.nextInt();
		int min=0;
		int max=99;
		int count=0;
		int guess=(min+max)/2;
		boolean find=false;
		while(!find){
			System.out.println(guess);
			count++;
			if(guess==guessed){
				find=true;
			}else if(guess<guessed){
				min=guess;
			}else{max=guess;
			}
			guess=(min+max)/2;
		}
		System.out.println(guess+"共查找了"+count+"次");
		
	}

}
