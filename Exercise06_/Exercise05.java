package Exercise06_;

import java.util.Scanner;

public class Exercise05 {
	/**
	 * 编程，不用判断语句，输入百分制的分数，根据以下标准评定分数等 级： 90～100:优秀 89-80:良好 79-70:中等 69-60:及格
	 * 0－59:不及格
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 输入一个五分制分数，5：(90~100)优秀，4：(89~80)良好，
		// 3：(79~70)中等，2：(69~60)及格，1：(0~59)不及格
		String a[] = { "不及格", "及格", "中等", "良好", "优秀" };
		System.out.println("输入一个五分制分数：");
		int n = scanner.nextInt();
		System.out.println(a[n - 1]);

	}
}
