package com.eoe.basic.day02.Exercise;

public class Exercise26 {
	/**
	 * 通过args数组，从控制台获取数据
	 */
	public static void main(String[] args) {
		//将第一个输入的数据转换为int类型
		int a=Integer.parseInt(args[0]);
		//将第二个输入的数据转换为int类型
		int b=Integer.parseInt(args[1]);
		System.out.println("a+b="+(a+b));
		System.out.println("\ta-b="+(a-b));
		System.out.println("\ta*b="+a*b);
		System.out.println("\ta/b="+a/b);
		System.out.println("\ta%b="+a%b);
	}
}
