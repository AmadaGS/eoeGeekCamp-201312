package ClassTestday04;

import java.util.Random;

public class Test24 {

	/**
	 * 随机产生10个分数（要求产生的分数在[60,100]之间），
	 * 找出最高分。 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int max=Integer.MAX_VALUE;//int类型的最小值
		for(int i=1;i<=10;i++){
			int score=random.nextInt(41)+60;
			System.out.print(score+"  ");
			if(max>score){
				max=score;
			}
		}
		System.out.println();
		System.out.println("最高分:"+max);
	}

}
