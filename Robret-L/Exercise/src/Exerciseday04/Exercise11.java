package Exerciseday04;

import java.util.Random;

public class Exercise11 {
public static void main(String[] args) {
	//创建一个随机对象，用于产生随机数
	Random random=new Random();
	for(int i=0;i<=10;i++){
		//System.out.println(random.nextDouble());
		//System.out.println(random.nextInt());
		System.out.println(random.nextInt(101));
	}
}
}
