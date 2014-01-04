package day1231;

import java.util.Scanner;

public class Exercise01 {

	public Exercise01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("n=");
		int n = scanner.nextInt();
		int result = f(n);
		System.out.println("f(" + n + ")=" + result);
	}

	static int f(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int y = f(n - 1) + f(n - 2);
		return y;
	}

}
