package Exerciseday04;

import java.util.Scanner;

public class Exercise16 {
	/**
	 * 用循环语句计算2n，n的值由键盘输入。
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		 double result=1;//保存计算结果
			/*计数循环的写法
			 * 1.循环变量的初始值  
			 * 2.循环变量值的变更
			 * 3.循环内容
			 * 4.循环继续的条件
			 */
		 for(int i=1;i<=n;i++){
			 result*=2;
		 }
		 System.out.println(2+"的"+n+"次方="+result);
		 
	}
}
