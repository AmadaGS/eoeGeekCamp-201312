package ClassTestday04;

import java.util.Scanner;

public class Test18 {
	/**
	 * 用循环语句计算n!，即1*2*3*…*n，n的值由键盘输入。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		double result=1;//保存计算结果
//		int i=1;
//		result*=i;//result=1;
//		i++;//i=2
//		result*=i;//result=1*2
//		i++;//i=3
//		result*=i;//reuslt=1*2*3
//		i++;//i=4;
//		result*=i;//reuslt=1*2*3*4;
		for(int i=1; i<=n ;i++){
			result*=i;
		}
		System.out.println(n+"！="+result);
	}
}
