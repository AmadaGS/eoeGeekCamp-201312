package com.eoe.pre.daytext04;

public class Test10 {
	public static void main(String[] args){
		for(int i=1;;i++){
			if(i<20){
				System.out.println("罚做俯卧撑"+i+"次");
				continue;
			}
			if(i<100){
				System.out.println("呼哧...呼哧..."+i+"次");
				continue;
			}
			break;
		}
		System.out.println("体力不支，最终Over！");
	}

}
