package com.eoe.learnjava.day03;

public class Pround {

	/**����һ���ܱ���С���������λ�ķ���pround����main�����е��ø÷�����
	 * ����С���������λ
	 * @param args
	 */
	public static void main(String[] args) {
		
		double result = pround(3.758648,5);
		System.out.println(result);
	}

	private static double pround(double value,int n) {
		double pow10 = Math.pow(10, n);//����10��n�η�
		double result = Math.round(value*pow10);
		result = result*1.0/pow10;
		return result;
	}

}
