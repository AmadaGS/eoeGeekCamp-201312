package exerciseday06;

import java.util.Arrays;
import java.util.Random;

public class Exercise09 {
	//冒泡排序
	public static void main(String[] args) {
		int[] a = new int[10];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(101);
		}
		System.out.println(Arrays.toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] < a[j + 1]) {
					int c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
