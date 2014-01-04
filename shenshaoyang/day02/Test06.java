package com.eoe.basicLearn.day02;

public class Test06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=5;
		//byte b2=b1+3;//编译出错，大类型的数据不能存放在小类型的变量中
		byte b2=5+3;
		double a1=2.6;
		double a2=a1-0.6;
		System.out.println(b2);
		System.out.println(a2);
		double d = 2.6;
		double e = d - 2;
		System.out.println(e);
		for(int i=0;i<128;i++){
			System.out.println((char)i+":"+i);
		}
	   System.out.println((char)0+":"+0);//打印unicode码为0的字符
	   System.out.println((char)1+":"+1);//打印unicode码为1的字符
       System.out.println((char)127+":"+127);//打印unicode码为127的字符
	   int score=65;
       boolean pass;
       pass=score>=60;
       System.out.println("考试通过:"+pass);
	}

}
