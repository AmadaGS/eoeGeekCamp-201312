package com.eoe.basic.day02;

public class Conversion {

	/**
	 * 数据类型的自动转换
	 * @param args
	 */
	public static void main(String[] args) {
			int i=-2;
			long l=i;
			System.out.println("int类型的-2："+Integer.toBinaryString(i));
			System.out.println("long类型的-2："+Long.toBinaryString(l));
			//int类型自动转换成long类型，超过32位自动补0或1
			
			int a= 0x1000001;
			System.out.println("int:"+Integer.toBinaryString(a)+"   "+a);
			float b=a;
			System.out.println("flota"+Integer.toBinaryString((int)b)+"  "+b);
            //int类型转flota类型精度丢失，int是32位，float是23位
			
			int c=129 ;                      //1000 0001
			byte d=(byte) c;
			System.out.println(Integer.toBinaryString(c)+"  "+c);
			System.out.println(Integer.toBinaryString(d)+"  "+d);
			//int转化为byte型，发生了数据位变成符号位
			
			int e=257 ;                      //1 0000 0001
			byte f=(byte) e;             //高位被舍弃
			System.out.println(Integer.toBinaryString(e)+"  "+e);
			System.out.println(Integer.toBinaryString(f)+"  "+f);
			
			int x= Byte.MAX_VALUE+1;  //-128-127      1000 0000
			byte y=(byte)x;                  
			System.out.println(Integer.toBinaryString(x)+"  "+x);
			System.out.println(Integer.toBinaryString(y)+"  "+y);
			
	}

}
