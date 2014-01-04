package com.fengleiit.work;



import java.util.Scanner;

public class Exercise002 {
	public static void main(String[] args) {
		
		
		for(int value=100;value<=200;value++){
		if(isPrime(value)){   //判断是否是质数
		System.out.println(value+"是质数");
		}
		}
	}
	public static boolean isPrime(int n){
		boolean isPrime=true;
		int k=(int) Math.sqrt(n);
		for(int i=2;i<=k&&isPrime;isPrime=n%i!=0,i++);
			return isPrime;
	}
}
