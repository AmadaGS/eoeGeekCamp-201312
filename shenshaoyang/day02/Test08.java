package com.eoe.basicLearn.day02;

public class Test08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=Byte.MAX_VALUE+1;
     byte b= (byte) i;
	 System.out.println("int:" + i);
	 System.out.println("byte:" + b);
	 char c=65;
	 System.out.println(c);
	 int d='a';
	 System.out.println(d);
	 char ca='a';
     int e=ca+13;
      //char cb=(char) (ca+1);
		System.out.println((char)e);
		System.out.println((int)((char)e));
		System.out.println("\t俺在第11个位置开始显示的哟！");
		System.out.println("/t俺在第11个位置开始显示的哟！");
		System.out.print("下一个输出和我不在同一行\n双引号和俺一起输出啦！");
		System.out.println("\n\"双引号和俺一起输出啦！\"");
		System.out.println("显示一个路径：D:\\eoeschool\\docs");
	}
}
