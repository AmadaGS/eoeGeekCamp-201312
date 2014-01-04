package com.eoe.pre.day01;

public class Test20 {

	/**
	 * ¼ÆËãn£¡=1*2*3*...*n
	 */
	public static void main(String[] args) {
		double result=1;
//		result*=1;//result=result*1;
//		result*=2;//result=1*2;
//		result*=3;//result=1*2*3;
//		//
//		result*=10;//result=1*2*3..*10
//		
//		int i=1;
//		result*=i;//
//		i++;//i=2
//		
//		result*=i;
//		i++;//i=3
//		
//		result*=i;
//		i++;//i=4
		
		
		for(int i=1;i<=5;i++){
			result*=i;
		}
		System.out.println("1*2*3*4*5="+result);
	}

}
