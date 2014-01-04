package Exercise06_;

import java.util.Arrays;
import java.util.Random;

public class Exercise04 {
	/**
	 * 随机产生5个60～100之间的分数，降序排序。
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(41) + 60;
		}
		System.out.println(Arrays.toString(scores));
		// 将最高分换到scores[0]
		int temp = 0;
		for (int j = 1; j < scores.length; j++) {
			for (int i = 0; i < scores.length - j; i++) {
				if (scores[i] < scores[i + 1]) {
					temp = scores[i];
					scores[i] = scores[i + 1];
					scores[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));

	}
}
