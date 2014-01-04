package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise02 {
	/**
	 * 示例：演示自定义方法和调用自定义的方法
	 */
	// 以下定义五静态变量
	static String name;// 姓名
	static char sex;// 性别
	static int age;// 年龄
	static double height;// 身高
	static String type;// 性格

	public static void main(String[] args) {
		input();// 第一次调用input()为第一个人输入数据
		// 以下代码表示该人说话，做自我介绍
		System.out.print("嗨，大家好！，俺叫" + name);
		System.out.print(",今年：" + age + "岁");
		System.out.print(",身高：" + height + "米,");
		System.out.println("俺是一个" + type + "的" + sex + "生");
		System.out.println("俺失恋啦！，呜呜...");
		input();// 第二次调用input()为第一个人输入数据
		// 以下代码表示该人说话，做自我介绍
		System.out.print("嗨，大家好！，俺叫" + name);
		System.out.print(",今年：" + age + "岁");
		System.out.print(",身高：" + height + "米,");
		System.out.println("俺是一个" + type + "的" + sex + "生");
		System.out.println("俺中了五百万啦！，(*^__^*)...");
	}

	// 定义input方法：用于给name,sex,age,height和type输入数据
	static void input() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("姓名：");
		name = scanner.next();
		System.out.println("性别：");
		sex = scanner.next().charAt(0);
		System.out.println("年龄：");
		age = scanner.nextInt();
		System.out.println("身高：");
		height = scanner.nextDouble();
		System.out.println("性格：");
		type = scanner.next();
	}
}
