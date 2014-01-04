package day1226;

import java.util.Scanner;

public class Code02 {

	public Code02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 打印5行5列的星号
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		int n = scanner.nextInt();
		// 打印5行星号
		for (int j = 1; j <= n; j++) {
			// 打印1行星号
			for (int i = 1; i <= n; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
