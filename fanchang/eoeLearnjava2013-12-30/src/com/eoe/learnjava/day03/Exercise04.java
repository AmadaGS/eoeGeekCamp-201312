package com.eoe.learnjava.day03;
import java.util.Scanner;


public class Exercise04 {

	/**
	 * ��д����ʵ�������ַ����ͱ���ֵ����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ַ��ͱ���a=");
		char a=scanner.next().charAt(0);
		System.out.println("���������ַ��ͱ���b=");
		char b=scanner.next().charAt(0);
		a=(char) (a+b);
		b=(char) (a-b);
        a=(char) (a-b);
        System.out.println("a="+a+"   b="+b);
	}

}
