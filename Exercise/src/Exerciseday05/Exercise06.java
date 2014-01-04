package Exerciseday05;

import java.util.Scanner;

public class Exercise06 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int score;
	do{
		System.out.println("score=");
		score=scanner.nextInt();
	}while(score<0||score>5);
	/**
	 * score=0: 不及格      score=1:不及格       score=2:不及格
	 * score=3：及格
	 * score=4:良好
	 * score=5:优秀
	 */
String[] grades={"不及格","不及格","不及格","及格","良好","优秀"};
System.out.println(grades[score]);

}
}
