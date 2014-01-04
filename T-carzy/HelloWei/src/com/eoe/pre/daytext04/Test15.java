package com.eoe.pre.daytext04;
import java.util.Scanner;
public class Test15 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int score;
		do{
			System.out.println("输入五分制分数 ：");
			score=scanner.nextInt();
		}while(!(score>=0&&score<=5));
		System.out.println("输入正确");
	}

}
