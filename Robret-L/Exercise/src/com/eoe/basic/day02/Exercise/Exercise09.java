package com.eoe.basic.day02.Exercise;

public class Exercise09 {
	/**
	 * 变量作用域示例(3).
	 */
		public static void main(String[] args) {
			String name="张飞";
			System.out.println(name);
			{
		 //String name ="张飞";
		 System.out.println(name);
			}
		}
}
