package com.eoe.pre.day02;

import java.util.Scanner;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-Test01");
		System.out.println("2-Test02");
		System.out.println("3-Test03");
		System.out.println("4-Test04");
		System.out.println("5-Test05");
		int select=scanner.nextInt();
		switch (select) {
		case 1:
			Test01.main(null);
			break;
		case 2:
			Test02.main(new String[]{"abc","defg"});
			break;
		case 3:
			com.eoe.pre.day01.Test03.main(null);
		}
	}

}
