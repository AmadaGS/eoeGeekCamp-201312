package ClassTestday02;

import java.util.Scanner;

public class Test22 {

	/**
	 * ʾ�� ͨ������̨����һ���˵�����  �Ա� ���� ���ߺ��Ը�
	 * 	Ȼ�� �ø��˺ʹ�������ҽ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("������");
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("����:");
		int age=scanner.nextInt();
		System.out.println("���ߣ�");
		double height=scanner.nextDouble();
		System.out.println("�Ը�");
		String type=scanner.next();
		System.out.println("�ˣ���Һã��ҽ� "+name);
		System.out.println("������"+age+"��");
		System.out.println("������һ��"+type+"��"+sex+"��");

	}

}