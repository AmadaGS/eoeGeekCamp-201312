package Exercise06_;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
	/**
	 * 输入一个字母，统计该字母在以下英文中出现的所有位置 father mother we are family
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = "father mother we are family";
		System.out.println("输入一个字符：");
		char c = scanner.next().charAt(0);
		// 创建一个空数组，用于统计该字符在字符串中出现的所有位置
		int[] position = {};
		for (int i = 0; i < text.length(); i++) {
			if (c == text.charAt(i)) {
				// 数组position容量加1
				position = Arrays.copyOf(position, position.length + 1);
				// 在数组的新增元素中记录字符c在字符串text中出现的位置。
				position[position.length - 1] = i;
			}

		}
		System.out.println(Arrays.toString(position));

	}
}
