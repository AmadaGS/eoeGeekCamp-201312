package ClassTestday04;

import java.util.Scanner;

public class Test17 {
	/**
	 * 用循环语句计算m的n次方，m和n的值由键盘输入。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("m n=");
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		//m的1次方 m*=1;
		double result=1;//保存计算结果
//		int i=1;
//		result*=m;//m的1次方 result=m
//		i++;//i=2;
//		result*=m;//result=m*m;
//		i++;//i=3;
//		result*=m;//result=m*m*m
		for(int i=1;i<=n;i++){
			result*=m;
		}
		System.out.println(m+"的"+n+"次方="+result);
	}

}
