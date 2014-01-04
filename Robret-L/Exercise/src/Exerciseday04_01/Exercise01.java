package Exerciseday04_01;

import java.util.Scanner;

public class Exercise01 {
	/**
	 * 2、 输入1~9个字符串，例如12345,打印如下字符图形：
	 * 12345
	 *  1234
	 *   123
	 *    12
	 *     1
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一个字符串：");
	    String s=scanner.next();
	    String space="";
	    int len=s.length();//(计算字符串长度)
		for(int i=1;i<=len;i++){
			System.out.println(space+s.substring(0,len-i+1));
			space+=" ";
		}
	}
}
