package com.eoe.pre.day01;

public class Test05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b=15;// -128-127
		double kb=Math.pow(2, 10);
		System.out.println("1kb="+Math.pow(2, 10)+"byte");
		System.out.println("1Mb="+Math.pow(2, 20)+"字节");
		System.out.println("1GB="+Math.pow(2, 31)+"字节");
		System.out.println("1TB="+Math.pow(2, 40)+"字节");
		int a=125;//4byte的存储空间
		long c=1000;//8byte的存储空间
		c=2200000000l;
	}

}
