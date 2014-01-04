package com.eoe.exam01;

public class Examination04 {
	/**
	 * 编程查找100~300之间所有的质数。
	 */
	public static void main(String[] args) {
		for (int i = 101; i < 300; i += 2) {
			boolean isPrime = true;
			int k = (int) Math.sqrt(i);
			for (int j = 2; j <= k && isPrime; j++) {
				isPrime = i % j != 0;
			}
			if (isPrime) {
				System.out.println(i);
			}
		}

	}
}
