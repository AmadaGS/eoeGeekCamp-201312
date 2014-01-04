package exerciseday06;

import java.util.Arrays;
import java.util.Random;

public class Exercise06 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Random random = new Random();
		for (int j = 1; j < a.length; j++) {
			a[j] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		// 最高分
		for (int j = 1; j < a.length; j++) {
			if (a[0] < a[j]) {
				int c = a[0];
				a[0] = a[j];
				a[j] = c;
			}
		}
		System.out.println(Arrays.toString(a));
		// 第二高分
		for (int j = 2; j < a.length; j++) {
			if (a[1] < a[j]) {
				int c = a[1];
				a[1] = a[j];
				a[j] = c;
			}
		}
		System.out.println(Arrays.toString(a));
		// 第三高分
		for (int j = 3; j < a.length; j++) {
			if (a[2] < a[j]) {
				int c = a[2];
				a[2] = a[j];
				a[j] = c;
			}
		}
		System.out.println(Arrays.toString(a));
		// 第四高分
		for (int j = 4; j < a.length; j++) {
			if (a[3] < a[j]) {
				int c = a[3];
				a[3] = a[j];
				a[j] = c;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
