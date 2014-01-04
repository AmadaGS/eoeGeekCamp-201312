package Exerciseday05;

public class Exercise06 {
	/**
	 * 用三重循环打印100～999
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {        //外循环表示百位数
			for (int j = 0; j <= 9; j++) {    //中间循环表示十位数
				for (int k = 0; k <= 9; k++) {//内循环表示个位数
					System.out.print(i * 100 + j * 10 + k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
