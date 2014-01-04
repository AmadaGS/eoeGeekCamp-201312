package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个字符串: ");
		String text=input.next();		
		String text1=input.next();
		if(text.equals(text1)){//字符串内容进行比较
			System.out.println("两者相同");
	}else{
		System.out.println("两者不相同");
	}
}
}
