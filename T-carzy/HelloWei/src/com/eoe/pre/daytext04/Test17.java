package com.eoe.pre.daytext04;
import java.util.Scanner;
/**
 * 用循环语句计算m的n次方，m和n的值由键盘输入。
 */
public class Test17 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("m=");
		int m=scanner.nextInt();
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=1;
		for(int i=1;i<=n;i++){
			result*=m;
		}
		System.out.println(m+"的"+n+"次方="+result);
	}

}
