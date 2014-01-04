package com.eoe.basic.day03.Exercise;

public class Exercise07 {
	/**
	 * switch示例： switch语句的“贯穿”现象
	 */
	public static void main(String[] args) {
		int score = 4;
		switch (score) {
		case 5:
			score++;
		case 4:
			score++;
		case 3:
			score++;
		case 2:
			score++;
		case 1:
			score++;
		case 0:
			score++;
		default:
			System.out.println(score);
		}
	}

}
