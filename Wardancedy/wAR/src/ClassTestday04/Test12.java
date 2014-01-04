package ClassTestday04;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score;//表示输入的分数
		do{
			System.out.println("输入5分制的分数");
			score=scanner.nextInt();
		}while(score<0 || score>5);
		System.out.println("输入ok");
	}

}
