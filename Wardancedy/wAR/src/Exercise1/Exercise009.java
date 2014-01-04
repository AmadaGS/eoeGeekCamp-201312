package Exercise1;

import java.util.Scanner;

public class Exercise009 {

	/**编写程序，不用第三个变量，用减法实现两个变量值互换。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("a=");
		int  a=scanner.nextInt();
		System.out.println("b=");
		int b=scanner.nextInt();
		a=a+b;//a=2,b=3 a=a+b=5 ,b=b=3
		b=a-b;//a=a+b,b=a   
		a=a-b;//a=b,b=a
		System.out.println("a="+a+"\tb="+b);

	}

}
