package day0102sort;

import java.util.Arrays;
import java.util.Random;

public class day0102Insertsort02 {

	public day0102Insertsort02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			int k = a[i];
			int j;
			for (j = i - 1; j >= 0 && k < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = k;
		}
		System.out.println(Arrays.toString(a));
	}

}
