package day0102sort;

import java.util.Arrays;
import java.util.Random;

public class day0102Count {

	public day0102Count() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 计数排序－不用排序的排序。 适用于整数类型的数据，并且取值范围不太大。 算法特点：
	 * 将数组a元素的值作为数组b元素的下标，数组b元素的值是该分值重复出现的次数。 计算的时间复杂度：O(n)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[20];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(11);
		}
		System.out.println(Arrays.toString(a));
		int[] b = new int[11];
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		for (int i = b.length - 1; i >= 0; i--) {
			for (int j = 1; j < b[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}

}
