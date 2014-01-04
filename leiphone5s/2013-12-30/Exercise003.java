package com.fengleiit.work;

/*2、查找100～999之间的所有回文数。回文数是指：
数字左右对称，例如101,121,232*/

public class Exercise003 {
	public static void main(String[] args) {
		for(int i=1;i<9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					if(i==k){
						System.out.println(i*100+j*10+k);
					}
				}
			}
		}
	}
}
