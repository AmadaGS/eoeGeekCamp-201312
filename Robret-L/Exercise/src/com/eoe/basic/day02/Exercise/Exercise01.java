package com.eoe.basic.day02.Exercise;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		 System.out.print("f=");
     	 double f= scanner.nextDouble();
     	 double c=(f-32)*5/9;
     	 System.out.println("摄氏温度是"+10*Math.round(c)/10.0);
	}
}
