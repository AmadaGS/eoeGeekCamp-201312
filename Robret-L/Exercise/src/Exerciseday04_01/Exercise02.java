package Exerciseday04_01;

import java.util.Scanner;

import com.eoe.tools.MyTools;

public class Exercise02 {
	private static final String MyTool = null;

	/**
	 * 3、 编写程序， 计算：1+1/2+1/3+..+1/n，要求： 键盘输入n的值，保留小数点后2位。
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		int n = scanner.nextInt();
		double result = 0;
		for (int i = 1; i <= n; i++) {
			result += 1.0 / i;
		}
		System.out.println("1+1/2+1/3+..+1/n=" + MyTools.pround(result, 2));
	}
}
