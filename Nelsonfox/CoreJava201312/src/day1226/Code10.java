package day1226;

public class Code10 {

	public Code10() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 一直三人：张飞，王菲，刘亦菲，将红桃3到红桃A依次发给这三人
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "张飞", "王菲", "刘亦菲" };
		String[] cards = { "红桃3", "红桃4", "红桃5", "红桃6", "红桃7", "红桃8", "红桃9",
				"红桃j", "红桃Q", "红桃K", "红桃A", };
		for (int i = 0; i < cards.length; i++) {
			System.out.println(names[i % 3] + ":" + cards[i]);// i%3保证下标不会超过2
		}
	}

}
