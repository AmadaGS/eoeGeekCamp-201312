package Test;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[] bSort = { 88, 99, 66, 55, 33 };
		System.out.println(Arrays.toString(bSort));
		int temp = 0;
		for (int i = 1; i < bSort.length; i++) {
			for (int j = 0; j < bSort.length - i; j++) {
				if (bSort[j] > bSort[j + 1]) {
					temp = bSort[j];
					bSort[j] = bSort[j + 1];
					bSort[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(bSort));
		}
	}
}
