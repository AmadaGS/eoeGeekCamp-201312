package com.eoe.pre.day02;

public class Test05 {

	/**substring:从字符串中取出指定范围的子串
	 * substring(start);
	 * substring(start,end);
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	 */
	public static void main(String[] args) {
		String s="12345";
		int len=s.length();
		for(int i=0;i<s.length();i++){
			System.out.println(s.substring(0,len-i));
		}
		s="  12345 ";
		System.out.println(s.trim());
	}

}
