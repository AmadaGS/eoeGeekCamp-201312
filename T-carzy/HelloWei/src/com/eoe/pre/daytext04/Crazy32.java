package com.eoe.pre.daytext04;
/**
 * 2、 输入1~9个字符串，例如12345,打印如下字符图形：
 * 12345
 *  1234
 *   123
 *    12
 *     1
 */
import java.util.Scanner;
public class Crazy32 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入1-9个字符 ");
		String s=scanner.next();
		String kong="";
		for(int i=1;i<=s.length();i++){
			System.out.println(kong+s.substring(0,s.length()-i+1));
			kong+=" ";
		}
	}

}
