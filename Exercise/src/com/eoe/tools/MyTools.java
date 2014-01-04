package com.eoe.tools;
/**
 * MyTools��������
 * ����һ�鳣�õķ�����
 * @author yw
 *
 */
public class MyTools {
	/**
	 * ����С�����indexλ
	 * @param a����������
	 * @param index��������λ��
	 * @return�����صĽ��
	 */
	public static double pround(double a,int index){
		double result=a*Math.pow(10, index);
		result=Math.round(result);
		result/=Math.pow(10, index);
		return result;
	}
	/**
	 * ����1~n�ĺ�
	 * @param n����ֵ
	 * @return������1~n�ĺ�
	 */
	public int addn(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	/**
	 * fact������n��
	 * @param n����ֵ
	 * @return������n!���
	 */
	public double fact(int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		return result;
	}
	/**
	 * �ж�n�Ƿ�������
	 * @param n�����жϵ���
	 * @return�������Ƿ���������true����
	 */
	public static boolean isPrime(int n){
		boolean isPrime=true;
		int k=(int) Math.sqrt(n);
		for(int i=2;i<=k&&isPrime;isPrime=n%i!=0,i++);
		return isPrime;
	}
}
