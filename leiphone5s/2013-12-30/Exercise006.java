package com.fengleiit.work;

import java.util.Arrays;
import java.util.Random;

/*随机产生5个60～100之间的分数，降序排序。*/
public class Exercise006 {
	public static void main(String[] args) {
		Random random=new Random();
		int[] value=new int[5];
		for(int i=0;i<5;i++){
			value[i]=random.nextInt(41)+60;
			System.out.print(value[i]+" ");
		}
		
		for(int i=0;i<value.length-1;i++){
			for(int j=i+1;j<value.length;j++){
				if(value[i]<value[j]){
					int temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(value));
	}
}
