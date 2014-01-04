package Exerciseday04_01;

import java.util.Scanner;

public class Exercise05 {
	/*
	 * *7、由人通过键盘输入一个0～99之间的整数，
	 * 让电脑用二分查找法找到该数。
	文件名：Exercise06.java  
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入一个要猜的数：");
		int guessed=scanner.nextInt();
		int min=0;
		int max=99;
		int guess=(min+max)/2;//中间数，二分查找
		int count=0;
		boolean find=false;//fasle为没有找到，true为找到
	     while(!find){
			System.out.println(guess);
			count++;//统计查找次数
			if(guess==guessed){
			find=true;		
		}else if(guess<guessed){
			min=guess;//調整下限到guess
		}else{
			max=guess;//調整上限到guess
		}
		guess=(min+max)/2;
	     }
		System.out.println(guess+"一共猜了"+count+"次");
		
	
	}
}
