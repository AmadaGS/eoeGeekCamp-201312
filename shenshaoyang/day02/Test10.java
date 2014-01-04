package com.eoe.basicLearn.day02;

import java.util.Scanner;

public class Test10 {

	/**
	 * @param args示例：通过控制台输入一个人的姓名、性别、年龄、身高和性格
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner a=new Scanner(System.in);
    System.out.println("姓名");
     String name=a.next(); 
     System.out.println("性别");
     char sex=a.next().charAt(0);
     System.out.println("年龄：");
     int age=a.nextInt();
		System.out.println("身高：");
		double height=a.nextDouble();
		System.out.println("性格：");
		String type=a.next();
		System.out.print("嗨，大家好，俺叫"+name);
		System.out.print("，今年"+age+"岁");
		System.out.print("，俺是一个"+type+"的"+sex+"生");
	}

}
