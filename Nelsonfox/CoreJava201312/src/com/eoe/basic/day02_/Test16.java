package com.eoe.basic.day02_;

import java.util.Scanner;
//�ŷ� ��
public class Test16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("����������");
		String name=scanner.next();
		System.out.print("�Ա�:");
		char sex=scanner.next().charAt(0);
		System.out.print("����:");
		int age=scanner.nextInt();
		System.out.print("��ߣ�");
		float height=scanner.nextFloat();
		System.out.println("�ˣ���Һã�����"+name+
			"������"+age+"��,���:"+height+
			"��,����һ��"+sex+"ʿ");
	}
}
