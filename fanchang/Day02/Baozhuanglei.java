package com.eoe.basic.day02;
public class Baozhuanglei {

	/**
	 * 包装类的使用
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println(Byte.MAX_VALUE );
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Integer.toBinaryString(151));  //十进制转化成二进制
			System.out.println(Integer.toHexString(151));      //十进制转化成十六进制	
			System.out.println(Integer.toOctalString(8));       //十进制转换成八进制
			int i=Integer.parseInt("128");                                
			System.out.println(i);
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(a+b);
	}

}
