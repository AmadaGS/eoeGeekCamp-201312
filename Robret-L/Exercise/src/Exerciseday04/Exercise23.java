package Exerciseday04;

import java.util.Random;
import java.util.Scanner;

public class Exercise23 {
		/**
		 *猜数游戏，电脑随机产生一个0-99之间的整数，
		 *由人来猜数。
		 */
		public void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			//电脑随机产生的0-99之间的整数
			int guessed=new Random().nextInt(100);
			int guess;//保存人猜的数
			int count=0;
			do{
				count++;
				System.out.print("猜吧:");
				guess=scanner.nextInt();
				if(guess<guessed){
					System.out.println("猜小了");
				}else if(guess>guessed){
					System.out.println("猜大了");
				}else{
					System.out.println("猜对啦!");
					break;
				}
			}while(true);
			if(count==1){
				System.out.println("偶像，签个字吧！");
			}else if(count==2){
				System.out.println("蒙的吧！");
			}else if(count<=7){
				System.out.println("你很懂地猜数策略");
			}else{
				System.out.println("脑积水吧!");
			}
		}
	}
	
