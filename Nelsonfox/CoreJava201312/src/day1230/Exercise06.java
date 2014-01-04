package day1230;

import java.util.Arrays;
import java.util.Random;

public class Exercise06 {

	public Exercise06() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 随机产生5个60～100之间的分数，降序排序。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Random random = new Random();
		int[] score = new int[5];//定义一个数组长度为5
		for (int i = 0; i < score.length; i++) {//随机取出5个60~100的数
			score[i] = random.nextInt(41) + 60;

		}
		System.out.println(Arrays.toString(score));
		for (int i = 0; i < score.length; i++) {//双重循环降序排列
			for (int j = score.length-1 ; j > i; j--) {
				if (score[j] > score[j - 1]) {
					int temp = score[j];
					score[j] = score[j - 1];
					score[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(score));
	}

}
