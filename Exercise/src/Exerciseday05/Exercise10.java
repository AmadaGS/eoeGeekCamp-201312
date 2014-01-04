package Exerciseday05;

import java.util.Random;

public class Exercise10 {
	public static void main(String[] args) {
	Random random =new Random();
	String[] names={"张飞","王菲","刘亦菲"};
	String[] cards={"红桃3","红桃4","红桃5","红桃6",
	        "红桃7","红桃8","红桃9","红桃10",
	        "红桃J","红桃Q","红桃K","红桃A","红桃2"};
	for (int i = cards.length-1;i>0; i--) {
		int index=random.nextInt(i);
		//cards[index]与cards[i]交换
		String temp=cards[i];
		cards[index]=cards[i];
		cards[i]=temp;
		System.out.println(names[i%3]+":"+cards[i]);
	}
	

}
}