package ClassTestday04;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score=-1;
		while(score<0 || score>5){
			System.out.println("输入5分制分数:");
			score=scanner.nextInt();
		}
		System.out.println("ok");
}
}