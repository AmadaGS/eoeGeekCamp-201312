package com.eoe.basic.day02.Exercise;

public class Exercise10 {
	/**
	 * 调用包装类显示个基本数据类型的取值范围。
	 */
		public static void main(String[] args) {
			//Byte类的常用方法和常量
			System.out.println("byte的数据总数:"+Math.pow(2,8));
			System.out.println("bytr的取值范围:"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
			byte bMax=Byte.parseByte("127");
			System.out.println(bMax);
			//short类型的常用方法和常量
			System.out.println("short的数据总数:"+Math.pow(2, 16));
			System.out.println("short的取值范围:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
			short shortValue=Short.parseShort("1000");
			System.out.println(shortValue);
			//Integer的常用方法和变量
			System.out.println("int的数据总数:"+Math.pow(2, 32));
			System.out.println("int的取值范围:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
			int intValue=Integer.parseInt("2000000");
			System.out.println(intValue);
			String binaryValue=Integer.toBinaryString(16);
			String hexValue=Integer.toHexString(16);
			String octalValue=Integer.toOctalString(16);
			System.out.println("16转换为二进制："+binaryValue);
			System.out.println("16转换为十六进制："+hexValue);
			System.out.println("16转换为八进制："+octalValue);
			//long 的常用方法和变量
			System.out.println("long的数据总数："+Math.pow(2, 64));
			System.out.println("long的取值范围："+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
			long longValue=Long.parseLong("2000000");
			System.out.println("Long.parseLong(\"2000000\")="+longValue);
			binaryValue=Long.toBinaryString(16);
			hexValue=Long.toHexString(16);
			octalValue=Long.toOctalString(16);
			System.out.println("16转换为二进制："+binaryValue);
			System.out.println("16转换为十六进制"+hexValue);
			System.out.println("16转换为八进制："+octalValue);
			//Float类的常用方法和常量
			System.out.println("float的数据总数："+Math.pow(2, 32));
			System.out.println("float的取值范围："+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
			float floatValue=Float.parseFloat("2000000");
			System.out.println("Float.parseFloat(\"2000000\")="+floatValue);
			System.out.println(hexValue);
			hexValue=Float.toHexString(16);
			System.out.println("16转换为十六进制："+hexValue);
			//Double类的常用方法和常量
			System.out.println("double的数据总数："+Math.pow(2, 64));
			System.out.println("double的取值范围："+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
			double doubleValue=Double.parseDouble("2000000");
			System.out.println(doubleValue);
			binaryValue=Long.toBinaryString(16);
			hexValue=Long.toHexString(16);
			octalValue=Long.toOctalString(16);
			System.out.println("16转换为二进制："+binaryValue);
			System.out.println("16转换为十六进制："+hexValue);
			System.out.println("16转换为八进制："+octalValue);

			
		}	
}
