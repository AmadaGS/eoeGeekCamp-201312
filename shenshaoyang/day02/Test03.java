package com.eoe.basicLearn.day02;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Byte类的常用方法和常量
		 System.out.println(Byte.MAX_VALUE);
		  System.out.println(Byte.MIN_VALUE);
		  byte bMax=Byte.parseByte("127");
		  System.out.println(bMax);
		  System.out.println(Short.MAX_VALUE+"/n"+Short.MIN_VALUE);
	  System.out.println(Integer.toBinaryString(99));
	  System.out.println(Integer.toHexString(99));
	  System.out.println(Integer.toOctalString(99));
	 System.out.println(Long.toBinaryString(99));
	 System.out.println(Long.toHexString(99));
	 
      int a=Integer.parseInt(args[0]);
      int b=Integer.parseInt(args[1]);
       System.out.println(a+b);	
       }

}
