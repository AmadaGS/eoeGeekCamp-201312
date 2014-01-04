package com.eoe.pre.daytext04;
import java.util.Scanner;
public class Test14 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int score;
		for(score=222;score<0||score>5;){
			System.out.println("输入五分制分数：");
			score=scanner.nextInt();
		}
		System.out.println("OK");
	}

}
