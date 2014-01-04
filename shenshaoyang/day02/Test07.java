package com.eoe.basicLearn.day02;

public class Test07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-2;
		long l=i;
		System.out.println("int类型的-2:"+Integer.toBinaryString(i));
		System.out.println("long类型的-2:"+Long.toBinaryString(l));
		int a=0x1000001;
		System.out.println(Integer.toBinaryString(i));
		float b=a;
		System.out.println(Integer.toBinaryString((int)b));//int类型转换为float类型丢失精度
		int c=129;
		byte d=(byte)c;
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));//int转换为byte类型出现的数据位变符号位的现象。
		int e=257;
		byte f=(byte)e;
		System.out.println("int:"+Integer.toBinaryString(e)+"  "+e);
		System.out.println("byte:"+Integer.toBinaryString(f)+"  "+f);
	}

}
