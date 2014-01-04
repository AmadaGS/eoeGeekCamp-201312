package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®:");
		String text=scanner.next();
		String space=" ";
		for(int i=0;i<text.length()/2+1;i++){
			System.out.println(space+text.substring(i, text.length()-i));
			space+=" ";
		}
		}
		
	}

