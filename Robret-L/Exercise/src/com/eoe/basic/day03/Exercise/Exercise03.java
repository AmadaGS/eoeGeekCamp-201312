package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise03 {
	/**
	 * 课堂练习： 1、将自我介绍的代码块定义为方法。 2、在main方法中调用该方法。
	 */
	// 以下定义五静态变量
	static String name;// 姓名
	static char sex;// 性别
	static int age;// 年龄
	static double height;// 身高
	static String type;// 性格

	public static void main(String[] args) {
		input();// 第一次调用input()为第一个人输入数据
		say();// 第一次调用say()做自我介绍
		cry();// 表达第一个人的感情：哭
		input();// 第二次调用input()为第一个人输入数据
		say();// 第二次调用say()做自我介绍
		laungh();// 表达第二个人的感情：笑
	}

	// 定义say方法表示做自我介绍
	private static void say() {
		System.out.print("嗨，大家好！，俺叫" + name);
		System.out.print(",今年：" + age + "岁");
		System.out.print(",身高：" + height + "米,");
		System.out.println("俺是一个" + type + "的" + sex + "生");
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

	// 表达哭的感情
	static void cry() {
		System.out.println("俺失恋啦！，呜呜...");
	}

	// 表达笑的感情
	static void laungh() {
		System.out.println("俺中了五百万啦！，哈哈...");
	}
}
