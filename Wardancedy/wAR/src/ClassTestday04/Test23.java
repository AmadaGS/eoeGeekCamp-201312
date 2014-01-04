package ClassTestday04;

import java.util.Scanner;

public class Test23 {
	/**
	 * 判定质数，键盘输入数据。
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		boolean isPrime=true;//isPrime代表是否是质数，true：是
		/* 23
		 * 2 3 4 5 6 7 8 9 10 11 12
		 */
		int k=(int) Math.sqrt(n);//ctrl+1
		for(int i=2;i<=k&&isPrime;i++){
			isPrime=n%i!=0;
//			if(n%i!=0){
//				isPrime=n%i!=0;
//			}else{
//				isPrime=n%i!=0;
//			}
		}
		System.out.println(n+"是质数:"+isPrime);
	}

}
