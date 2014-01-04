package com.eoe.pre.day01;

public class Test12 {

	/**
	 * 'A':65
	 * 'B':66
	 * ...
	 * 'Z':90
	 * 'a':97
	 * 
	 * 'z':122
	 * '0':48
	 * ..
	 * '9':57
	 * 
	 * ctrl+d
	 * @param args:unicode±àÂë£¬asciiÂë
	 */
	public static void main(String[] args) {
		//whileÑ­»·
		int i=1;
		while(i<=127){
			System.out.println((char)i+":"+i);
			i++;//i=i+1;
		}
		i=20000;
		while(i<=20050){
			System.out.println((char)i);
			i++;
		}
		//
	}

}
