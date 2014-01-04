package Exerciseday04;

import java.util.Scanner;

public class Exercise19 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		 int result=0;
		 for(int i=1;i<=n;i++){
			 result+=i;
		 }
		 System.out.println("∑"+n+"="+result);
	}

}
