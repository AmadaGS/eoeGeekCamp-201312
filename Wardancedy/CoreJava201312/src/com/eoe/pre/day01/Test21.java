package com.eoe.pre.day01;

public class Test21 {

	/*
	 * ¼ÆËã1+2+3+..100
	 */
	public static void main(String[] args) {
		int result=0;
//		result+=1;//result=1;
//		result+=2;//result=1+2;
//		result+=3;//result=1+2*3
//		
//		int i=1;
//		result+=i;
//		i++;//i=2
//		
//		result+=i;
//		i++;//i=3
//		
//		result+=i;
//		i++;
//		
		for(int i=1;i<=100;i++){
			result+=i;
		}
		System.out.println("1+2+3+...+100="+result);
	}

}
