package day1231;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {

	public Exercise03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "张飞", "王菲", "刘亦菲", "咖啡", "吗啡" };
		System.out.println(Arrays.toString(name));
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择删除的位置1~5：");
		int index;
		do {
			index = scanner.nextInt();
		} while (index < 0 || index > 5);
		for (int i = index; i < name.length - 1; i++) {
			name[i - 1] = name[i];
		}
		name = Arrays.copyOf(name, name.length - 1);
		System.out.println(Arrays.toString(name));
	}

}
