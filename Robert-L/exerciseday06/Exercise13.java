package exerciseday06;

import java.util.Scanner;

public class Exercise13 {
/**
 * 用递归计算m的 n次方
 * @param args
 */
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("m,n=");
	int m=scanner.nextInt();
	int n=scanner.nextInt();
	System.out.println(f(m,n));
}
static double f(int m,int n){
	if(n==0){
		return 1;
	}
	return m*f(m,n-1);
}
}
