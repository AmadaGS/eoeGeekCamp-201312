package day1230;

import java.util.Arrays;
import java.util.Random;

public class Exercise07 {

	public Exercise07() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 随机产生5个分数，用以Test24为基础，用冒泡方式降序排序。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(101);

		}
		System.out.println(Arrays.toString(score));
		for (int i = 0; i < score.length; i++) {
			for (int j = score.length-1; j > i; j--) {
				if (score[j] > score[j - 1]) {
					int t = score[j];
					score[j] = score[j - 1];
					score[j - 1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(score));
	}

}
