package day1230;

import java.util.Scanner;

public class Exercise05 {

	public Exercise05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 编程，不用判断语句，输入百分制的分数，根据以下标准评定分数等级： 90～100:优秀 89-80:良好 79-70:中等 69-60:及格
	 * 0－59:不及格
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入百分制的分数:");//键盘输入百分制分数
		int score = scanner.nextInt();
		String[] dengji = { "不及格", "不及格", "不及格", "不及格", "不及格", "不及格", "及格",
				"中等", "良好", "优秀" };//定义“等级”数组
		System.out.println(dengji[score / 10]);//将分数除10带入下标

	}

}
