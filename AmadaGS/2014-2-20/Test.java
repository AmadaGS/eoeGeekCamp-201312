package com.eoe.se2.day13;

public class Test {

	
	public static void main(String[] args) {
		print(0,"hello");
		print(1,"hello","world");
		print(2,"hai","ni","hao");
	}
	//若是带多个参数，可变参数类型一定放在最后
	static void print(int count,String...args){
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
