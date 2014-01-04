package Exercise06_;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		// int[] bSort={ 33,99,88,55,66};
		// int temp = 0;
		// for (int i = 0; i <bSort.length - 1; i++) {
		// for (int j = 0; j < bSort.length - 1 - i; j++) {
		// if (bSort[j] >bSort[j + 1]) {
		// temp = bSort[j];
		// bSort[j] =bSort[j + 1];
		// bSort[j + 1] = temp;
		// }
		// }
		// }
		// for (int i = 0; i <bSort.length; i++)
		// System.out.println(bSort[i]);
		int[] bSort = {  88, 99, 55,33, 66 };
		System.out.println(Arrays.toString(bSort));
		int temp = 0;
		for (int j = 1; j < bSort.length; j++) {
			for (int i = 0; i < bSort.length - j; i++){
				if (bSort[i] > bSort[i + 1]) {
					temp = bSort[i];
					bSort[i] = bSort[i + 1];
					bSort[i + 1] = temp;
				}
			}
			
//		}
//		j=1;
//		// 第一次排序
//		for (int i = 0; i < bSort.length - 1; i++){
//			if (bSort[i] > bSort[i + 1]) {
//				temp = bSort[i];
//				bSort[i] = bSort[i + 1];
//				bSort[i + 1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(bSort));
//		for (int i = 0; i < bSort.length - 2; i++)
//			if (bSort[i] > bSort[i + 1]) {
//				temp = bSort[i];
//				bSort[i] = bSort[i + 1];
//				bSort[i + 1] = temp;
//			}
//		System.out.println(Arrays.toString(bSort));
//
//		for (int i = 0; i < bSort.length - 3; i++)
//			if (bSort[i] > bSort[i + 1]) {
//				temp = bSort[i];
//				bSort[i] = bSort[i + 1];
//				bSort[i + 1] = temp;
//			}
//		System.out.println(Arrays.toString(bSort));
//		for (int i = 0; i < bSort.length - 4; i++)
//			if (bSort[i] > bSort[i + 1]) {
//				temp = bSort[i];
//				bSort[i] = bSort[i + 1];
//				bSort[i + 1] = temp;
//			}
		System.out.println(Arrays.toString(bSort));

	}
	}
}
