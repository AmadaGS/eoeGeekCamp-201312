package com.fengleiit.brj;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数: ");
		int value=scanner.nextInt();
		if(isPrime(value)){   //判断是否是质数
		System.out.println(value+"是质数");
		}else{
			System.out.println(value+"不是质数");
		}
		
	}
	public static boolean isPrime(int n){
		boolean isPrime=true;
		int k=(int) Math.sqrt(n);
		for(int i=2;i<=k&&isPrime;isPrime=n%i!=0,i++);
			return isPrime;
	}
}
