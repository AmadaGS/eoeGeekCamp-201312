package com.eoe.pre.daytext04;
import java.util.Scanner;

/**
 * 【示例-26】打印字符图形(2)
          输入1~9个字符串，例如12345,打印如下字符图形：
		12345
		 234
		  3

 */
public class Crazy29 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入字符串：");
		String kong="";
		String text=scanner.next();
		for(int i=0;i<text.length()/2+1;i++){
			System.out.println(kong+text.substring(i,text.length()-i));
			kong+=" ";
		}
	}

}
