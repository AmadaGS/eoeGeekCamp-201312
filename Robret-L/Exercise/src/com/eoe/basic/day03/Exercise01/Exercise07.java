package com.eoe.basic.day03.Exercise01;

import java.util.Scanner;

public class Exercise07 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("请输入三个数：");
    int a=scanner.nextInt();
   // System.out.println(a);
    int b=scanner.nextInt();
   // System.out.println(b);
    int c=scanner.nextInt();
  //  System.out.println(c);
   // System.out.println("a="+Math.max(c,Math.max(a, b)));
   // System.out.println("c="+Math.min(c, Math.min(a, b)));
    int min=Math.min(c, Math.min(a, b));
    int max=Math.max(c,Math.max(a, b));
    int middle=a+b+c-(max+min);
    System.out.println("输出结果："+max+"  "+middle+"  "+min);
}
}
