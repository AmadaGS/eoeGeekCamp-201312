package com.eoe.exam01;

import java.util.Scanner;

public class Examination01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("a=");
		int a=scanner.nextInt();
		System.out.println("b=");
		int b=scanner.nextInt();
		System.out.println("c=");
		int c=scanner.nextInt();
		int e=Math.max(a, Math.max(b, c));
		int f=Math.min(a, Math.min(b, c));
	   System.out.println("中间数="+(a+b+c-e-f));
	}
		

}
