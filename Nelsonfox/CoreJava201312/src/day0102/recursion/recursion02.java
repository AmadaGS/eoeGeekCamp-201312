package day0102.recursion;

import java.util.Scanner;

public class recursion02 {

	public recursion02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 斐波那契列数 0 1 1 2 3 5 8 13 21 33 f(n)=f(n-1)+f(n-2) n=0,f(0)=0,n=1,f(1)=1
	 * 用递归计算f(n) n由键盘输入。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
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
