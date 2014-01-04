package com.fengleiit.pjo;

import java.util.Random;
import java.util.Scanner;
public class Exercise02 {
	public static void main(String[] args) {
		Random random=new Random();
		String[] names={"ÕÅ·É","Íõ·Æ","ÁõÒà·Æ"};
		String[] cards={"ºìÌÒA","ºìÌÒ2","ºìÌÒ3","ºìÌÒ4","ºìÌÒ5","ºìÌÒ6",
				"ºìÌÒ7","ºìÌÒ8","ºìÌÒ9","ºìÌÒ10","ºìÌÒJ","ºìÌÒQ","ºìÌÒK"};
		int i;
		for(i=cards.length-1;i>0;i--){
			int index=random.nextInt(i);
			String temp=cards[index];
			cards[index]=cards[i];
			cards[i]=temp;
			System.out.println(names[i%3]+cards[i]);			
		}
		System.out.println(names[0]+":"+cards[0]);
	}
}
