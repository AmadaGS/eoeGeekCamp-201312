package com.eoe.pre.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		String[] grades={"不及格","不及格","不及格","及格","良","优"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入5分制的分数:");
		int score=scanner.nextInt();
		System.out.println(grades[score]);
	}

}
