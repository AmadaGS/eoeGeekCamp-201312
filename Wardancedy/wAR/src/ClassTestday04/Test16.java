package ClassTestday04;

import java.util.Scanner;

public class Test16 {
	/**
	 * 用循环语句计算2n，n的值由键盘输入。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		//2*2*2*2
		double result=1;//保存计算结果
//		int i=1;
//		result*=2;//result=result*2; 2的1次方 2
//		i++;//i=2;
//		result*=2;//result=2*2;  2的2次方
//		i++;//i=3;
//		result*=2;//result=2*2*2; 2的次方
		/*计数循环的写法
		 * 1.循环变量的初始值  
		 * 2.循环变量值的变更
		 * 3.循环内容
		 * 4.循环继续的条件
		 */
		for(int i=1;i<=n;i++){
			result*=2;
		}
		System.out.println(2+"的"+n+"次方="+result);
	}

}
