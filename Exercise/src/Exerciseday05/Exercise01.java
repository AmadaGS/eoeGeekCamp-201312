package Exerciseday05;

import java.util.Arrays;

public class Exercise01 {
	public static void main(String[] args) {
//		int[] src = { 3, 4, 5, 7, 9, 12 };
//		int[] dest = new int[5];
//		System.arraycopy(src, 1, dest, 1, 3);
//		System.out.println("src=" + Arrays.toString(src));
//		System.out.println("dest=" + Arrays.toString(dest));
		int[] src = { 3, 4, 5, 7, 9, 12 };
		int[] dest = Arrays.copyOf(src, 5);
		System.out.println("src=" + Arrays.toString(src));
		System.out.println("dest=" + Arrays.toString(dest));

	}

}
