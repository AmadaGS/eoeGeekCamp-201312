package com.fengleiit.pjo;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		String uname="张三";
		String password="123456";
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String userName=scanner.next();
		if(!uname.equals(userName)){
			System.out.println("请先注册用户:");
			return;
		}
		System.out.println("请输入密码:");
		String pwd=scanner.next();
		if(!pwd.equals(pwd.trim())){
			System.out.println("密码错误!");
			return;
		}
		System.out.println("成功登陆！");
 
	}
}
