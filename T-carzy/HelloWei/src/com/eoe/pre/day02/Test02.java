package com.eoe.pre.day02;
import java.util.Scanner;
import java.util.Arrays;
public class Test02{
	public static void main(String[] args)
    {
	    System.out.println(Arrays.toString(args));
		String[] grades={"������","������","����","��","��"};
	    	Scanner scanner=new Scanner(System.in);
	    System.out.println("��������Ƶķ���");
		int score=scanner.nextInt();
	    System.out.println(grades[score]);

    }
		   }