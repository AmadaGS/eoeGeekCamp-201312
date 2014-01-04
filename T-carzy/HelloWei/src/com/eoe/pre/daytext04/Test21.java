package com.eoe.pre.daytext04;
/**
 *编写程序计算公式：
 *(∑10+∑5)*(∑8+∑4)/(pow(2,8)-5!)+4!-pow(3,4)
 */
public class Test21 {
	public static void main(String[] args){
		double result=(add(10)+add(5))*(add(8)+add(4))/
				((pow(2,8)-fact(5))+fact(4)-pow(3,4));
		System.out.print("(∑10+∑5)*(∑8+∑4)/(pow(2,8)-5!)+4!-pow(3,4)=");
		System.out.println(result);
		
	}
	static double add(int n){
		double result=0;
		for (int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	static double fact(int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		return result;
	}
	static double pow(double m,int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=m;
		}
		return result;
	}

}
