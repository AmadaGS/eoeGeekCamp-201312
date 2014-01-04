package ClassTestday04;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		System.out.println("Σ"+n+"="+result);
	}

}
