package com.eoe.pre.day01;

import java.util.Scanner;

public class Test10 {

	/**
	 * &&：与运算
	 * 关系运算1 && 关系运算2  当两个关系运算都是true时，
	 * 与运算结果是true
	 * 
	 *  ||:或运算
	 *  关系运算1 || 关系运算2 
	 *  当两个关系运算的结果有一个是true时，
	 *  或运算的结果是true。
	 *  非运算：！关系运算：关系运算相反结果
	 *  java核心语法  java
	 *  android     android
	 *  数据库            sql
	 *  项目               project
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("java=");
		int java=scanner.nextInt();
		System.out.println("android=");
		int android=scanner.nextInt();
		System.out.println("sql=");
		int sql=scanner.nextInt();
		System.out.println("project=");
		int project=scanner.nextInt();
		if(java>=90 && android>=90 && sql>=90 && project>=90){
			System.out.println("恭喜，您被本公司录用，月薪5k");
		}else if(java>=90 && android>=90 &&(sql>=90 || project>=90)){
			System.out.println("恭喜，您被本公司录用，月薪4k");
		}else if(java>=90 || android>=90 || sql>=90 || project>=90){
			System.out.println("恭喜，您被本公司录用，月薪3k");
		}else{
			System.out.println("等通知吧");
		}
	}

}
