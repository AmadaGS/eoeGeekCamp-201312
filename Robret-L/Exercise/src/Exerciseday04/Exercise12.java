package Exerciseday04;

import java.util.Scanner;

public class Exercise12 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int score;//表示输入的分数
	do{
		System.out.println("输入一个五分制分数：");
	    score=scanner.nextInt();
	}while(score<0||score>5);
	System.out.println("输入ok!");
}
}
