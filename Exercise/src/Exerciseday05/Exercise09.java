package Exerciseday05;

import java.util.Arrays;
import java.util.Random;

import com.eoe.tools.MyTools;

public class Exercise09 {
	/**
	 * 随机产生10个[60,100]的分数，显示所有超过平均分的
	 * 分数和下标。
	 */
	public static void main(String[] args) {
		int[] scores=new int[10];
		Random random=new Random();
		double sumScore=0;//总分
		for (int i = 0; i < scores.length; i++) {
			scores[i]=random.nextInt(41)+60;
			sumScore+=scores[i];
		}
		System.out.println(Arrays.toString(scores));
		double avg=sumScore/scores.length;
		System.out.println("平均分="+MyTools.pround(avg, 1));
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>=avg){
				System.out.println(scores[i]);
			}
		}
	}

}
