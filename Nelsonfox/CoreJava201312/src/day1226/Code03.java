package day1226;

import java.util.Scanner;

public class Code03 {

	public Code03() {
		// TODO Auto-generated constructor stub
	}

	/**打印三角型的星号
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i=1;
//for(int j=1;j<=i;j++){
	//System.out.print("*");//代表不换行
//}
//System.out.println();//换行
//i++;//i=2
//打印两个*
//for(int j=1;j<=i;j++){
	//System.out.print("*");
//}
//System.out.println();
//打印三个*
//i++;//i=3
//for(int j=1;j<=i;j++){
	//System.out.println("*");
//}
//System.out.println();
	//}
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			//打印一行*
			for(int j=1;j<=i;j++){
			System.out.print("*");//这里不换行
			}
		}
		System.out.println();//换行很重要
	}
}
