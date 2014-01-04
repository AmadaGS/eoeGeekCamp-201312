package com.eoe.pre.day02;

public class Test04 {

	/**
	 * String类：equals()：比较两个字符串是否相等
	 */
	public static void main(String[] args) {
		String a="张飞";
		String b=new String("张飞");
		if(a.equals(b)){
			System.out.println("两个字符串相同");
		}else{
			System.out.println("两个字符串不相同");
		}
	}

}
