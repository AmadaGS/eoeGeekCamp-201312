package day0102sort;

import java.util.Arrays;
import java.util.Random;

public class day0102SelectSort {

	public day0102SelectSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[10];
		Random random = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = random.nextInt(100);

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
