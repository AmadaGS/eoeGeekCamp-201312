package Exerciseday05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
	/** 
	 * ����һ����ĸ��ͳ�Ƹ���ĸ������Ӣ���г��ֵ�����λ��
	 * father mother we are family
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String text="father mother we are family";
		System.out.println("����һ���ַ���");
		char c=scanner.next().charAt(0);
		//����һ�������飬���ڸ��ַ����ַ����еĳ��ֵ�λ��
		int[] pos={};
		 for (int i = 0; i < text.length(); i++) {
			if(c==text.charAt(i)){
				//����position������1
				pos=Arrays.copyOf(pos, pos.length+1);
				//�����������Ԫ���м�¼�ַ�c���ַ���text�г��ֵ�λ��
				pos[pos.length-1]=i;
		//��ʾ����pos������Ԫ��ֵ
			}
		 }
		System.out.println(Arrays.toString(pos));

		 }
		 }
