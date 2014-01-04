package com.eoe.pre.daytext04;
/**
 * 6、将判断一个数是否质数的代码封装一个名为isPrime方法，将该方法放在MyMath类中，
调用该方法找出100～200之间的所有质数。
 */
import com.eoe.pre.daytext04.Case;
public class Crazy35 {
	public static void main(String[] args){
		for(int i =101;i<200;i+=2){
			System.out.println(i+":"+Case.isPrime(i));
		}
	}

}
