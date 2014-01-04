package day0102Work;

import java.util.Scanner;

public class day0102Work01 {

	public day0102Work01() {
		// TODO Auto-generated constructor stub
	}

	/**用递归计算∑n
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	double result=sum(n);
	System.out.print("n=");
	System.out.print(result);
	}

	private static double sum(int n) {
		if(n==1){
		return 1;
		}
		double y=n+sum(n-1);
		return y;
	}
	
	}
	