package day1226;

import java.util.Scanner;

public class Code07 {

	public Code07() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 不用判断语句给5分制的分数评定成绩等级
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score;
		do {
			System.out.println("scores=");
			score = scanner.nextInt();

		} while (score < 0 || score > 5);
		// 不及格 不及格 不及格 及格 良好 优秀
		// 0 1 2 3 4 5
		String[] grades = { "不及格", "不及格", "不及格", "及格", "良好", "优秀" };
		System.out.println(grades[score]);
	}

}
