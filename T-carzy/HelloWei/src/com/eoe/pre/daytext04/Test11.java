package com.eoe.pre.daytext04;
import java.util.Random;
// 创建随机对象，用于产生随机数
public class Test11 {
	public static void main(String[] args){
		Random random=new Random();
		for(int i=1;i<=10;i++){
			System.out.println(random.nextInt(101));
		}
	}

}
