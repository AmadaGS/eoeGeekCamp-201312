package ClassTestday02;

import java.util.Scanner;

public class Test22 {

	/**
	 * 示例 通过控制台输入一个人的姓名  性别 年龄 身高和性格
	 * 	然后 让该人和大家做自我介绍
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("姓名：");
		String name=scanner.next();
		System.out.println("性别：");
		char sex=scanner.next().charAt(0);
		System.out.println("年龄:");
		int age=scanner.nextInt();
		System.out.println("身高：");
		double height=scanner.nextDouble();
		System.out.println("性格");
		String type=scanner.next();
		System.out.println("嗨，大家好，我叫 "+name);
		System.out.println("，今年"+age+"岁");
		System.out.println("，我是一个"+type+"的"+sex+"生");

	}

}
