package com.eoe.basic.day02_;
/**
 * ��дExercise04�࣬�������¹�ʽ��Ҫ����С�����2λ��
 * ��С��������λ�������롣
    (sqrt(20)+sqrt(10)/(sqrt(20)-sqrt(10))
 * @author yw
 */
public class Test {
	public static void main(String[] args) {
		/*ѧϰ�Ļ���
		 * Ԥϰ���Ͽ���������ϰ
		 * ����֪��
		 * double��˫���ȡ��������͵ı���
		 * sumScoreDouble Pascal
		 * main static for 
		 */
		double sqrt20=Math.sqrt(20);
		double sqrt10=Math.sqrt(10);
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		result=Math.round(result*100)/100.0;
		System.out.println("(sqrt(20)+sqrt(10)/(sqrt(20)-sqrt(10))="+result);
		
	}
}
