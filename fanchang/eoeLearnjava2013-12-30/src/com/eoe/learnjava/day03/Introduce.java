package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Introduce {

	/**
	 * 用自定义方法和调用自定义的方法，分别输入两个人的姓名，年龄， 身高，性格的信息
	 * 
	 * @param args
	 */

	static String name;// 定义五个信息变量
	static char sex;
	static int age;
	static double height;
	static String type;

	public static void main(String[] args) {

		input();// 输入数据方法
		say();
		feeling("我失恋了", ",呜呜~");
		feeling("很高兴哦~~~", ",哈哈");
	}

	private static void feeling(String cause, String content) {
		System.out.println(cause + content);
	}

	private static void say() {
		System.out.println("嗨！大家好，我叫" + name + "，今年" + age + ",身高" + height
				+ ",我是一个性格" + type + "的" + sex + "生.");
	}

	private static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("姓名：");
		name = scanner.next();
		System.out.print("性别：");
		sex = scanner.next().charAt(0);
		System.out.print("年龄：");
		age = scanner.nextInt();
		System.out.print("身高：");
		height = scanner.nextDouble();
		System.out.print("性格：");
		type = scanner.next();
	}

}
