package day0102Work;

import java.util.Scanner;

public class day0102Work02 {

	public day0102Work02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 用递归计算m的n次方
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		double result = sqrt(m, n);
		System.out.println("请输入数字");
		System.out.println("m的n次方为：" + result);
	}

	static double sqrt(int i, int j) {
		if (j == 1) {
			return i;
		}
		double y = i * sqrt(i, j - 1);
		return y;
	}
}
