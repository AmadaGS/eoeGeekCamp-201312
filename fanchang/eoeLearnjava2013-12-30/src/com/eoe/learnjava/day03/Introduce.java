package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Introduce {

	/**
	 * ���Զ��巽���͵����Զ���ķ������ֱ����������˵����������䣬 ��ߣ��Ը����Ϣ
	 * 
	 * @param args
	 */

	static String name;// ���������Ϣ����
	static char sex;
	static int age;
	static double height;
	static String type;

	public static void main(String[] args) {

		input();// �������ݷ���
		say();
		feeling("��ʧ����", ",����~");
		feeling("�ܸ���Ŷ~~~", ",����");
	}

	private static void feeling(String cause, String content) {
		System.out.println(cause + content);
	}

	private static void say() {
		System.out.println("�ˣ���Һã��ҽ�" + name + "������" + age + ",���" + height
				+ ",����һ���Ը�" + type + "��" + sex + "��.");
	}

	private static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������");
		name = scanner.next();
		System.out.print("�Ա�");
		sex = scanner.next().charAt(0);
		System.out.print("���䣺");
		age = scanner.nextInt();
		System.out.print("��ߣ�");
		height = scanner.nextDouble();
		System.out.print("�Ը�");
		type = scanner.next();
	}

}
