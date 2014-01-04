package Exerciseday04;

import java.util.Scanner;

public class Exercise27 {

	/**
	 * 打印字符图形(1)
	 输入1~9个字符串，例如12345,打印如下字符图形：
	 	12345
	 	2345
	 	345
	 	45
	 	5

	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入字符串:");
		String text=scanner.next();
		for(int i=0;i<text.length();i++){
			System.out.println(text.substring(i));
		}
	}
}
