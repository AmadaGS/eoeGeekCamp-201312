package day0102Work;

import java.util.Arrays;

public class day0102Work03 {

	public day0102Work03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 删除数组中重复的元素。(简介选择排序) {5,10,5,8,6,8}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 5, 10, 5, 8, 6, 8 };
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		count++;
		a = Arrays.copyOf(a, a.length - count);
		System.out.println(Arrays.toString(a));
	}

}
