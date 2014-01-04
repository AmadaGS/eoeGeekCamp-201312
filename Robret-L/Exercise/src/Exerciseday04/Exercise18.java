package Exerciseday04;

import java.util.Scanner;

public class Exercise18 {
	/**
	 * 用循环语句计算n!，即1*2*3*…*n，n的值由键盘输入。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		System.out.println(n+"! = "+result);
	}
}
