package com.eoe.pre.daytext04;
/**
 * 求100-999之间的水仙花数 153=1*1*1+5*5*3+ 3*3*3
 */
public class Text23 {
	public static void main(String[] args){
		for(int i=100;i<1000;i++){
			int g=i%10;
			int s=i/10%10;
			int b=i/100;
			if(i==g*g*g+s*s*s+b*b*b){
				System.out.println("水仙花数："+i);
			}
		}
	}

}
