package com.eoe.tools;

public class MyTools {
	/**
	 * 保留小数点后index位
	 * a：被保留数
	 * index：保留的位数
	 * return：返回的结果
	 */
	public static double pround(double a,int index){
	double result=a*Math.pow(10, index);
     result=Math.round(result);
     result/=Math.pow(10,index);
	 return result;
	}
	/**
	 * 计算1~n的和
	 * n：终值
	 * return：返回1~n的和
	 */
	public int  addn(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	/**
	 * fact：计算n！
	 *  n：终值
	 * return：返回n!结果
	 */
	public double fact(int n){
    double result=1;
     for(int i=1;i<=n;i++){
    	 result*=i;
     }
     return result;
	}
	/**
	 * 判断n是否是质数
	 *  n：被判断的数
	 * return：返回是否是质数，true：是
	 */
	public static boolean isPrime(int n){
		boolean isPrime=true;
		int k=(int) Math.sqrt(n);
		for(int i=2;i<=k&&isPrime;isPrime=n%i!=0,i++);
		return isPrime;
	}
}
			
