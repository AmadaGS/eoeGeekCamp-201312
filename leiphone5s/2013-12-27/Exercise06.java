package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int value;
		do{
		System.out.println("请输入一个百位数:");
		value=scanner.nextInt();
		}while(value<100||value>1000);
		int i=value%10;//求出个位
		int j=(value-i)/10%10;//求出十位
		int k=value/100;//求出百位
		if(i*i*i+j*j*j+k*k*k==value){
			System.out.println(value+"是一个水仙花数");
		}else{
			System.out.println(value+"不是水仙花数");
		}
		}
	}
