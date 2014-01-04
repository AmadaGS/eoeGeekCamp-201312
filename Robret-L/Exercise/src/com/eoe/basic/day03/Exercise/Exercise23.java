package com.eoe.basic.day03.Exercise;

public class Exercise23 {
	/**
	 * 示例：类的成员变量与方法中的局部变量重名现象
	 */
	static String name = "张飞";

	public static void main(String[] args) {
		String name = "刘亦菲";
		System.out.println(name);
	}

}
