package com.fengleiit.pjo;

import java.util.Arrays;

public class Exercise11 {
	public static void main(String[] args) {
		int[] a={50,40,20,10,30};
		System.out.println(Arrays.toString(a));
		for(int j=1;j<a.length;j++){
		for(int i=0;i<a.length-j;i++){
			int c=a[i];
			a[i+1]=c;
			a[i]=a[i+1];//将数组中后面的数值赋值给前面的
			}
		System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
	}

