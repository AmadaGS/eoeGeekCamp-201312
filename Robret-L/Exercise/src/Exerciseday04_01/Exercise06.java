package Exerciseday04_01;

import java.util.Scanner;

public class Exercise06 {
	/*
	 * *8、已知：斐波那契列数是指：前两个数分别是0和1,
	 * 从第三个数开始，每个数都是前两个
    数之和，如下所示：
	  	0,1,1,2,3,5,8,13,21,34,55,...
    公式：f(n)=f(n-2)+f(n-1)
    编程，键盘输入n,打印出f(1)～f(n)
   文件名：Exercise07.java 
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int a=0;
		int b=1;
		int c;
		int i=1;
		System.out.print(a+" "+b+" ");
		while(i<=n){
			c=a+b;//保存前面兩個值之和
			System.out.print(c+" ");
			a=b;
			b=c;
            i++;
			
			
		}
		
	}
}
