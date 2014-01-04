package ClassTestday02;

import java.util.Scanner;

public class Test25 {

	/**
	 * 不兼职第三个变量 直接交换两个变量的值 打印出交换前
	 * 交换后两个变量的值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.print("a=");
int a=scanner.nextInt();
System.out.print("b=");
int b=scanner.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a+"\tb="+b);
	}

}
