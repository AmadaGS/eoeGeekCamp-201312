package com.eoe.basic.day03.Exercise;

public class Exercise05 {
	/**
	 * 定义一个能保留小数点后任意位的方法pround，在main方法中调用该方法，
	 * 保留指定小数点后任意位。
	 */
	public static void main(String[] args) {
		System.out.println(pround(3.567,2));
		System.out.println(pround(3.758, 2));
	}
	static double pround(double value,int index){	
		
		double pow10=Math.pow(10, index);//计算10^n
		double result=value*pow10;
		result=Math.round(result);
		result=result*1.0/pow10;
		return result;
	}
}
