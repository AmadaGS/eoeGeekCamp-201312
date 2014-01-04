package exerciseday06;

import java.util.Scanner;

public class Exercise12 {
	/**
	 * 用递归计算∑n
	 */
public static void main(String[] args) {
	System.out.println("n=");
	int n=new Scanner(System.in).nextInt();
	System.out.println(f(n));
}
static int f(int n){
	if(n==1){
		return 1;
	}
	return n+f(n-1);
}
}
