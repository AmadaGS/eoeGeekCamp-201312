package com.eoe.se2.day13;

public class Test {

	
	public static void main(String[] args) {
		print(0,"hello");
		print(1,"hello","world");
		print(2,"hai","ni","hao");
	}
	//���Ǵ�����������ɱ��������һ���������
	static void print(int count,String...args){
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
