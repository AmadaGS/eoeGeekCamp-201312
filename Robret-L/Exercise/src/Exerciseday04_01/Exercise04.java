package Exerciseday04_01;

import com.eoe.tools.MyTools;

public class Exercise04 {
	/**
	 * 6、将判断一个数是否质数的代码封装一个名为isPrime方法，将该方法放在MyMath类中，
	调用该方法找出100～200之间的所有质数。
	 */
	public static void main(String[] args) {
		for(int i=101;i<200;i+=2){
			System.out.println(i+"："+MyTools.isPrime(i));
		}
		
	}
}
