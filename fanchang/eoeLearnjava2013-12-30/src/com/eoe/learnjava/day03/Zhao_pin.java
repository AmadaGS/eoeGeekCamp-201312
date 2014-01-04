package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Zhao_pin {

	/**公司招聘录用标准：
	 * 1. java、android、sql、project，四门课程均大于等去90
	 * 2. java、project在90分以上，sql、android至少有一门大于90
	 * 3. java、project、sql、android至少有一门90以上
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入java成绩：");
		int java = scanner.nextInt();
		System.out.println("请输入project的成绩：");
		int project = scanner.nextInt();
		System.out.println("请输入android的成绩：");
		int android = scanner.nextInt();
		System.out.println("请输入aql的成绩：");
		int sql = scanner.nextInt();
		
		if(java>=90 && project>=90 && sql>=90 && android>=90){
			System.out.println("恭喜您，您被录取了，月薪5k");
		}else if(java>=90 && project>=90 && (sql>=90 || android>=90)){
			System.out.println("恭喜您，您被录取了，月薪4k");
		}else if(java>=90 || project>=90 && sql>=90 || android>=90){
			System.out.println("恭喜您，您被录取了，月薪3K");
		}else{
			System.out.println("等通知吧！");
		}
		
	}
}
