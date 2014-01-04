package com.eoe.pre.daytext04;

/**
 * substring
 */
public class Test27 {
	public static void main(String[] args){
		String text="abcdefg";
		System.out.println(text);
		String subText=text.substring(1);
		System.out.println(subText);
		subText=text.substring(2,5);
		System.out.println(subText);
		String textOne=text+"";
		if(text.equals(textOne)){
			System.out.println("相同");
		}else{
			System.out.println("不相同");
		}
	}

}
