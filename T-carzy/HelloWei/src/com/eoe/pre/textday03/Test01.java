package com.eoe.pre.textday03;
/**
 * 示例：演示静态变量的定义和使用
 */
import java.util.Scanner;
public class Test01 {
	static String name;
	static int age;
	static char sex;
	static double height;
	static String type;
	public static void main(String[] args){
			Scanner scanner=new Scanner(System.in);
			System.out.println("姓名：");
			name=scanner.next();
			System.out.println("性别：");
			sex=scanner.next().charAt(0);
			System.out.println("年龄 ：");
			age=scanner.nextInt();
			System.out.println("身高：");
			height=scanner.nextDouble();
			System.out.println("性格：");
			type=scanner.next();
			System.out.print("嗨，大家好！我叫"+name);
			System.out.print(",我今年"+age);
			System.out.print("岁，身高"+height);
			System.out.println("米，我是个"+type+"的"+sex+"生");
			System.out.println("我失恋了，哈哈哈哈...");
	}

}
 