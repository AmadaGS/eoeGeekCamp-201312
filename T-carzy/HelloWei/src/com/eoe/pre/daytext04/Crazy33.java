package com.eoe.pre.daytext04;
import java.util.Scanner;
public class Crazy33 {
	static double pround(double a,int index){
		double result=a*Math.pow(10,index);
		result=Math.round(result);
		result/=Math.pow(10,index);
		return result;
		
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=0;
		for(int i=1;i<=n;i++){
			result+=1.0/i;
		}
		System.out.println("1+1/2+1/3+..+1/n="+pround(result, 2));
	}

}
