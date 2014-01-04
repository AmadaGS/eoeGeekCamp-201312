package day1226;

import java.util.Scanner;

public class Code08 {

	public Code08() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 查找相应的下标
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = { "张飞", "王菲", "刘亦菲", "咖啡", "吗啡" };
		System.out.println("输入姓名:");
		String name = scanner.next();
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {// 如果输入的名字和字符串的的相同，输出下标
				System.out.println(i);
				break;
			}
		}
	}

}