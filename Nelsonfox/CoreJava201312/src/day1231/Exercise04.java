package day1231;

import java.util.Arrays;
import java.util.Random;

public class Exercise04 {

	public Exercise04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 按降序排序（单循环版）
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		Random random = new Random();
		for (int j = 0; j < a.length; j++) {
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
		}// 第二部分
		for (int j = 2; j < a.length; j++) {
			if (a[1] < a[j]) {
				int c = a[2];
				a[2] = a[j];
				a[j] = c;
			}
		}// 第三部分
		for (int j = 4; j < a.length; j++) {
			if (a[3] < a[j]) {
				int c = a[3];
				a[3] = a[j];
				a[j] = c;
			}
		}// 第四部分
		System.out.println(Arrays.toString(a));
	}

}
