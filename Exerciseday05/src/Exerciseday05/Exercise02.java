package Exerciseday05;

import java.util.Arrays;

public class Exercise02 {
	/**
	 * System.arraycopy()
	 */
	public static void main(String[] args) {
		int[] a={10,8,7,12,6};
		int[] b=new int[4];
		System.arraycopy(a, 1, b, 0, 3);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
