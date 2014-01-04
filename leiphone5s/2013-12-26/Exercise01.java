package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n= ");
		int n=scanner.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=i;j++){
				for(int k=0;k<=j;k++){
				System.out.print("*"); 
				}
				System.out.println();
			}
			System.out.println();
		
		}
	}
}
