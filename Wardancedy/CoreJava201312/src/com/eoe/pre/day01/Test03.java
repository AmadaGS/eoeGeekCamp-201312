package com.eoe.pre.day01;

public class Test03 {

	/** 变量：计算机中用于存储数据的单元的表示。
	 * @param args
	 */
	public static void main(String[] args) {
		//20的平方根+10的平方根，再除以(20的平方根-10的平方根)		
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)));
		double sqrt10=Math.sqrt(10);
		double sqrt20=Math.sqrt(20);
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result);
		
	}

}
