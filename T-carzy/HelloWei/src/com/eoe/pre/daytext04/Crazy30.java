package com.eoe.pre.daytext04;
/**
 * 不用第三个变量，交换两个String类型的变量值.
 */
public class Crazy30 {
	public static void main(String[]args){
		String s1="abcdefg";
		String s2="higklmn";
		System.out.println("s1="+s1+"  s2="+s2);
		s1+=s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("s1="+s1+"  s2="+s2);
	}

}
