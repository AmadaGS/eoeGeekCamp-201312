package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int month;
		do{
			System.out.println("score=");
			month=scanner.nextInt();
		}while(month<1||month>12);
		String[] grades={"","31天","28天","31天","30天","31天",
				"30天","31天","31天","30天","31天","30天","31天"};
		System.out.println(grades[month]);
	}
}

