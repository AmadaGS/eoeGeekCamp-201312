package com.eoe.pre.textday03;
/**
 * 示例：
 * 	  1、定义带参方法feeling，表达人的感情，
 * 	  2、在main方法中调用feeling()
 */
import java.util.Scanner;
public class Test04 {
	static String name;
	static int age;
	static char sex;
	static double height;
	static String type;
	public static void main(String[] args){
		input();
		say();
		feeling("我失恋了"," 啊哈哈哈哈");
		input();
		say();
		feeling("我也失恋了", "哇哈哈哈");
		
	}
	static void input(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("姓名：");
		name=scanner.next();
		System.out.println("年龄：");
		age=scanner.nextInt();
		System.out.println("性别：");
		sex=scanner.next().charAt(0);
		System.out.println("身高：");
		height=scanner.nextDouble();
		System.out.println("性格：");
		type=scanner.next();
	}
	private static void say() {		
		System.out.print("嗨，大家好，我叫"+name);
		System.out.print(",今年："+age);
		System.out.print("岁,身高："+height);
		System.out.println("米，我是一个"+type+"的"+sex+"生");
	}
	static void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
}
