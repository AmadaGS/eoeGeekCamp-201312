package com.eoe.exam01;

import java.util.Arrays;

public class Examination03 {
	/**
	 * 已知数组int[] a={5,8,5,12,6,10,8}，将重复的数据从数组中删除，
	 * @param args
	 */
public static void main(String[] args) {
	int[] a={5,8,5,12,6,10,8};
	System.out.println(Arrays.toString(a));
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
           if(a[i]==a[j]){
        	   a=delete(a,j);
           }	
           
		}
	}
	System.out.println(Arrays.toString(a));
}

private static int[] delete(int[] b, int j) {
	for(int k=j;k<b.length-1;k++){
		b[k]=b[k+1];
	}
	b=Arrays.copyOf(b, b.length-1);
	return b;
	
			
}
}
