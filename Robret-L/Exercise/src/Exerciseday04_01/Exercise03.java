package Exerciseday04_01;

import java.util.Scanner;

import com.eoe.tools.MyTools;

public class Exercise03 {
	/*
	 *4、计算：1/1-1/2+1/3-1/4+...+1/(n-1)-1/n      
		键盘输入n的值，保留小数点后2位。 
	 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=0;
		for(int i=1;i<=n;i+=2){
			result+=1.0/i-1.0/(i+1);
		}
		System.out.println("1/1-1/2+1/3-1/4+...+1/(n-1)-1/n = "+MyTools.pround(result, 2));
	}
}
