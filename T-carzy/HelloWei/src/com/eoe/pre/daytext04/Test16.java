package com.eoe.pre.daytext04;
import java.awt.image.RescaleOp;
/**
 * 用循环语句计算2n，n的值由键盘输入。
 */
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class Test16 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=1;//存值
		for(int i=1;i<=n;i++){

			result*=2;
		}
		System.out.println(2+"的"+n+"次方="+result);
	}

}
