package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Logical {

	/**��������һ������Ʒ���������������㲢��ʾ�����Ƿ���������Ʒ���
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������һ������Ƶķ�����");
//		int score = scanner.nextInt();
//		boolean isScore=score>=0 && score <=5;
//		System.out.println("����Ʒ�����"+isScore);
		//��һ���߼�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������Ƶķ�����");
		int score = scanner.nextInt();
		boolean isnotScore=!(score<0 || score>5);
		System.out.println("����Ʒ�����"+isnotScore);
	}

}
