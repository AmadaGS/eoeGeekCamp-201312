package com.eoe.pre.daytext04;
import java.util.Scanner;
import java.util.Random;
/**
 *猜数游戏，电脑随机产生一个0-99之间的整数，
 *由人来猜数。
 */
public class Test24 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int guessed=new Random().nextInt(100000);
		int guess;
		int count=0;
		do{
			count++;
			System.out.println("猜吧:");
			guess=scanner.nextInt();
			if(guess<guessed){
				System.out.println("猜小了");
			}else if(guess>guessed){
				System.out.println("猜大了");
			}else{
					System.out.println("猜对了");
					break;
			}
		}while(true);
		if(count==1){
			System.out.println("开挂了吧");
		}else if(count==2){
			System.out.println("臭不要脸的你蒙对了");
		}else if(count<=7){
			System.out.println("你懂这方面的策略");
			
		}else{
			System.out.println("脑袋被驴踢了吧");
		}
		
	}

}
