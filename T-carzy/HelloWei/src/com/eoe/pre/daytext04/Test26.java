package com.eoe.pre.daytext04;
import java.util.Scanner;
/**
 * 判定质数，键盘输入数据。
 */
public class Test26 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		boolean isPrime=true;
		int k=(int)Math.sqrt(n);
		for(int i=2;i<=k&&isPrime;i++){
			isPrime=n%i!=0;
			if(n%i!=0){
				isPrime=n%i!=0;
			}
			else{isPrime=n%i!=0;}
		}
		System.out.println(n+"是质数"+isPrime);
	}

}
