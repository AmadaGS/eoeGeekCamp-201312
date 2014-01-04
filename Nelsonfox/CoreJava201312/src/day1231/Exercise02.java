package day1231;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

	public Exercise02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "张飞", "王菲", "刘亦菲", "吗啡" };
		// 插入前的数组
		System.out.println(Arrays.toString(name));
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入插入的位置1~4");
		int index;
		do {
			index = scanner.nextInt();
		} while (index < 1 || index > 4);
		// name容量加一
		name = Arrays.copyOf(name, name.length + 1);
		for (int i = name.length - 1; i >= index; i--) {
			name[i] = name[i - 1];
		}
		// 在index-1位置插入新的元素
		name[index - 1] = "咖啡";
		// 显示插入后的数组
		System.out.println(Arrays.toString(name));
	}

}
