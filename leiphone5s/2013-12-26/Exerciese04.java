package com.fengleiit.pjo;

import java.util.Arrays;
import java.util.Random;

public class Exerciese04 {
	public static void main(String[] args) {
		int[] scores=new int[10];
		Random random=new Random();
		double sumScore=0;
		for(int i=0;i<scores.length;i++){
			scores[i]=random.nextInt(41)+60;
			sumScore+=scores[i];
		}
		System.out.println(Arrays.toString(scores));
		double avg=sumScore/scores.length;
		System.out.println("Æ½¾ù·Ö="+pround(avg,2));
		for(int i=0;i<scores.length;i++){
			if(scores[i]>avg){
				System.out.println(scores[i]);
			}
		}
	}
	static double pround(double value,int index){
		double pow10=Math.pow(10, index);
		double result=value*pow10;
		result=Math.round(result);
		result=result*1.0/pow10;
		return result;
	}
}
