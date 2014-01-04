package Exerciseday04;

import java.util.Scanner;

public class Exercise17 {
	/**
	 * 用循环语句计算m的n次方，m和n的值由键盘输入。
	 */
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("m  n =");
	int m=scanner.nextInt();
	int n=scanner.nextInt();
	double result=1;
	for(int i=1;i<=n;i++){
		result*=m;
	}
	System.out.println(m+"的"+n+"次方="+result);
}
}
