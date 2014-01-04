package com.eoe.basicLearn.day02;

public class Test02 {

	/**
	 * @param args
	 */
  public static void main(String[] args) {
		// TODO Auto-generated method stub
      double a=Math.sqrt(20);
      double b=Math.sqrt(10);
      double result=(a+b)/(a-b);
      System.out.println(result);
      System.out.println(Math.round(result*10)/10d);
	}
}
