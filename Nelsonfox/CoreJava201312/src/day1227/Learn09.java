package day1227;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Learn09 {

	public Learn09() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = "father mother we are family";
		System.out.println("输入一个字符");
		char c = scanner.next().charAt(0);
		// 创建一个空数组，用于统计改字符在字符串中出现的所有位置
		int[] position = {};
		for (int i = 0; i < text.length(); i++) {
			if (c == text.charAt(i)) {
				// 数组position容量加1
				position = Arrays.copyOf(position, position.length + 1);
				// 在数组的新增元素中记录字符c在字符串text中出现的位置
				position[position.length - 1] = i;
			}
		}// 显示数组position的所有元素值
		System.out.println(Arrays.toString(position));
	}

}
