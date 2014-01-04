package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise01 {
	/**
	 * 示例：演示静态变量的定义和使用
	 */
	static String name;
	static char sex;
	static int age;
	static double height;
	static String type;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("姓名：");
		name = scanner.next();
		System.out.println("性别: ");
		sex = scanner.next().charAt(0);
		System.out.println("年龄： ");
		age = scanner.nextInt();
		System.out.println("身高： ");
		height = scanner.nextDouble();
		System.out.println("性格");
		type = scanner.next();
		System.out.println("嗨，大家好，我叫" + name);
		System.out.println(", 今年：" + age + "岁");
		System.out.println("， 身高：" + height + "米");
		System.out.println("我是一个" + type + "的" + sex + "士");
		System.out.println("我失恋了，呜呜、、、");

	}
}
