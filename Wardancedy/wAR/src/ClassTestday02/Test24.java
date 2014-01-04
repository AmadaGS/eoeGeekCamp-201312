package ClassTestday02;

import java.util.Scanner;

public class Test24 {

	/**
	 * 通过控制台输入两个变量的值，然后交换两个变量的值 打印出交换前 交换后的两个变量值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a=");
		int a = scanner.nextInt();
		System.out.println("b=");
		int b = scanner.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("a=" + a + "\tb=" + b);
	}

}
