package com.eoe.pre.daytext04;
import java.util.Scanner;
public class Crazy31 {
	public static void main(String[] args){
		String uname="daBian";
		String upwd="987654321";
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入用户名");
		String userName=scanner.next();
		if(!userName.equals(uname))
		{
			System.out.println("请先注册");
			return;
		}
		System.out.println("输入密码");
		String pwd=scanner.next();
		if(!upwd.equals(pwd.trim())){
			System.out.println("密码输入错误");
			return;
		}
		System.err.println("恭喜您中奖了，请带好您的斧头到中国农业银行门口领奖");
	}

}
