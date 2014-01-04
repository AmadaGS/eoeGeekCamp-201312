package Exerciseday05;

public class Exercise08 {
public static void main(String[] args) {
	String[] names={"张飞","王菲","刘亦菲"};
	String[] cards={"红桃3","红桃4","红桃5","红桃6",
	        "红桃7","红桃8","红桃9","红桃10",
	        "红桃J","红桃Q","红桃K","红桃A","红桃2"};
	for (int i = 0; i < cards.length; i++) {
		System.out.println(names[i%3]+":"+cards[i]);
	}
}
}
