import java.util.Random;
import java.util.Scanner;


public class Exercise02 {

	public static void main(String[] args) {
		int max = minimum();
			System.out.println();
			System.out.println("最小值是："+max);				
	}

	private static int minimum() {
		Random random=new Random();
		int max=Integer.MAX_VALUE;
		for(int i=1;i<=10;i++){
			int score=random.nextInt(41)+60;
			System.out.println(score+" ");
			if(max>score){
				max=score;
			}
		}
		return max;
	}
}
