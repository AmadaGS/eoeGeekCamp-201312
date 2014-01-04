package com.eoe.basic.day02.Exercise;
import java.util.Scanner;

public class Exercise01 {
	//只能正数实用；
 public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.print("a=");
		int a=scanner.nextInt();
		System.out.print("b=");
		int b=scanner.nextInt();
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a="+a+"b=");
		   
		   
  
   
    
}
}
