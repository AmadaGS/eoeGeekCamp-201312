package day1226;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Code13 {

	public Code13() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = "father mother we are family";
		System.out.println("输入一个字符:");
		char c = scanner.next().charAt(0);
		int[] position = {};
		for (int i = 0; i < text.length(); i++) {
			if (c == text.charAt(i)) {
				position = Arrays.copyOf(position, position.length + 1);
				position[position.length - 1] = i;
			}
		}
		System.out.println(Arrays.toString(position));
	}

}
