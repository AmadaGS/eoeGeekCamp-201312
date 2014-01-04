package Exerciseday04;

import java.util.Scanner;

public class Exercise30 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String uname="zhangFei";
		String upwd="123456";
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入用户名:");
		String userName=scanner.next();
		if(!userName.equals(uname)){
			System.out.println("请先注册");
			return ;
		}
		System.out.println("请输入密码");
		String pwd=scanner.next();
		if(!upwd.equals(pwd.trim())){
			System.out.println("密码错误");
			return ;
		}
		System.out.println("登陆成功");
	}
}
