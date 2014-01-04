package Exerciseday04;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int score=-1;
		do{
			System.out.println("输入五分制数：");
			score=scanner.nextInt();
		}while(!(score>=0&&score<=5));
		System.out.println("ok");
	}

}
