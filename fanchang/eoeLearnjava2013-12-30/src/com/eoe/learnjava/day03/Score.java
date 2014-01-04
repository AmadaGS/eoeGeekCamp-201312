package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Score {

	/**键盘输入java、android、sql三科分数
	 * 找出最高分
	 * @param args
	 */
	public static void main(String[] args) {
		//排除法
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("java、android、sql的成绩：");
//		int java = scanner.nextInt();
//		int android = scanner.nextInt();
//		int sql = scanner.nextInt();
//		if(java>=android&&java>=sql){
//			System.out.println("最高分："+java);
//		}else if(android>=sql){
//			System.out.println("最高分："+android);
//		}else{
//			System.out.println("最高分："+sql);
//		}
		
		//选择法
		Scanner scanner = new Scanner(System.in);
		System.out.println("java、android、sql的成绩：");
		int java = scanner.nextInt();
		int android = scanner.nextInt();
		int sql = scanner.nextInt();
		int max = java;
		if(max < android){
			max = android;
		}
		if(max<sql){
			max = sql;
		}
			System.out.println("最高分："+max);
	}

}
