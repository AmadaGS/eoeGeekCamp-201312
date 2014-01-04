package com.eoe.pre.textday03;
import java.util.Scanner;
/**
 * 课堂练习：
 * 	  1、将自我介绍的代码块定义为方法。
 *    2、在main方法中调用该方法。
 */
public class Test03 {
	static String name;
	static int age;
	static char sex;
	static double height;
	static String type;
	public static void main(String[] args){
		input();
		say();
		cry();
		input();
		say();
		laungh();
	}
	//定义input方法：用于给name,sex,age,height和type输入数据
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
	//定义say方法表示做自我介绍
	static void say(){
		System.out.print("嗨，大家好！我叫"+name);
		System.out.print(",我今年"+age);
		System.out.print("岁，身高"+height);
		System.out.println("米，我是个"+type+"的"+sex+"生");	
	}
	//表达哭的感情
	static void cry(){
		System.out.println("我失恋了，哇哈哈哈哈...");
	}
	//表达笑的感情
	static void laungh(){
		System.out.println("我天天失恋，啊哈哈哈哈...");
	}

}

