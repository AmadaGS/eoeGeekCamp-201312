package com.eoe.learnjava.day03;

public class Pround {

	/**定义一个能保留小数点后任意位的方法pround，在main方法中调用该方法，
	 * 保留小数点后任意位
	 * @param args
	 */
	public static void main(String[] args) {
		
		double result = pround(3.758648,5);
		System.out.println(result);
	}

	private static double pround(double value,int n) {
		double pow10 = Math.pow(10, n);//计算10的n次方
		double result = Math.round(value*pow10);
		result = result*1.0/pow10;
		return result;
	}

}
