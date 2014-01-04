package day1226;

import java.util.Random;

public class Code11 {

	public Code11() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String[] names = { "张飞", "王菲", "刘亦菲" };
		String[] cards = { "红桃3", "红桃4", "红桃5", "红桃6", "红桃7", "红桃8", "红桃9",
				"红桃10", "红桃J", "红桃Q", "红桃K", "红桃A", "红桃2" };
		for (int i = cards.length - 1; i > 0; i--) {//cards.length-1最大下标
			// 随机产生一个0~i-1之间的整数->index
			int index = random.nextInt(i);
			// 以下三個命令交換cards[index]和cards[i]
			// 目的是將随机产生的拍跳出来打印，保证该张牌以后被排除
			// 在未产生的拍之外
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
			System.out.println(names[i % 3] + ":" + cards[i]);
		}
	}

}
