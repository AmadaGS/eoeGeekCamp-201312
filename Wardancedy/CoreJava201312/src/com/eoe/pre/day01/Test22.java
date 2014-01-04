package com.eoe.pre.day01;

public class Test22 {

	/**
	 * 计算:(Σ8+Σ5)/(Σ8-Σ5)+5!-3!
	 */
	public static void main(String[] args) {
//		feeling("俺捡了五百万啦","哈哈....");
//		feeling("俺失恋啦", "呜呜...");
//		int result=add(5,3);
//		System.out.println(result);
		
		double result=(add(8)+add(5))/(add(8)-add(5))+fact(5)-fact(3);
		System.out.println(result);
	}
	
	//计算n！  结构(模块)化程序设计原理：积木式
	static double fact(int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		return result;
	}
	//计算Σn
	static int add(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	
//	//复用性
//	static void feeling(String cause,String content){
//		System.out.print(cause);
//		System.out.println(content);
//	}
//	//Math.round(),pow()
//	static int add(int a,int b){
//		int result=a+b;
//		return result;
//	}
}
