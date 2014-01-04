package day1226;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import com.eoe.tools.Mytools;

public class Code09 {

	public Code09() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 随机产生10个[60,100]的分数，显示所有超过平均分的数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[10];
		Random random = new Random();
		double sumScore = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(41) + 60;// 随机产生10个60~100的数
			sumScore += scores[i];// 10个数相加
		}
		System.out.println(Arrays.toString(scores));
		double avg = sumScore / scores.length;// 平均分
		System.out.println("平均分为：" + Mytools.pround(avg, 1));
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= avg) {
				System.out.println(scores[i]);
			}
		}
	}

}
