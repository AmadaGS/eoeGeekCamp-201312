package com.eoe.basic.day02.Exercise;

public class Exercise09 {
/**
 * ���ð�װ����ʾ�������������͵�ȡֵ��Χ��
 */
	public static void main(String[] args) {
		//Byte��ĳ��÷����ͳ���
		System.out.println("byte����������:"+Math.pow(2,8));
		System.out.println("bytr��ȡֵ��Χ:"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		byte bMax=Byte.parseByte("127");
		System.out.println(bMax);
		//short���͵ĳ��÷����ͳ���
		System.out.println("short����������:"+Math.pow(2, 16));
		System.out.println("short��ȡֵ��Χ:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		short shortValue=Short.parseShort("1000");
		System.out.println(shortValue);
		//Integer�ĳ��÷����ͱ���
		System.out.println("int����������:"+Math.pow(2, 32));
		System.out.println("int��ȡֵ��Χ:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		int intValue=Integer.parseInt("2000000");
		System.out.println(intValue);
		String binaryValue=Integer.toBinaryString(16);
		String hexValue=Integer.toHexString(16);
		String octalValue=Integer.toOctalString(16);
		System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
		System.out.println("16ת��Ϊʮ�����ƣ�"+hexValue);
		System.out.println("16ת��Ϊ�˽��ƣ�"+octalValue);
		//long �ĳ��÷����ͱ���
		System.out.println("long������������"+Math.pow(2, 64));
		System.out.println("long��ȡֵ��Χ��"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		long longValue=Long.parseLong("2000000");
		binaryValue=Long.toBinaryString(16);
		hexValue=Long.toHexString(16);
		octalValue=Long.toOctalString(16);
		System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
		System.out.println("16ת��Ϊʮ������"+hexValue);
		System.out.println("16ת��Ϊ�˽��ƣ�"+octalValue);
		//Float��ĳ��÷����ͳ���
		System.out.println("float������������"+Math.pow(2, 32));
		System.out.println("float��ȡֵ��Χ��"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		float floatValue=Float.parseFloat("2000000");
		System.out.println(hexValue);
		hexValue=Float.toHexString(16);
		System.out.println("16ת��Ϊʮ�����ƣ�"+hexValue);
		//Double��ĳ��÷����ͳ���
		System.out.println("double������������"+Math.pow(2, 64));
		System.out.println("double��ȡֵ��Χ��"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		double doubleValue=Double.parseDouble("2000000");
		System.out.println(doubleValue);
		binaryValue=Long.toBinaryString(16);
		hexValue=Long.toHexString(16);
		octalValue=Long.toOctalString(16);
		System.out.println("16ת��Ϊ�����ƣ�"+binaryValue);
		System.out.println("16ת��Ϊʮ�����ƣ�"+hexValue);
		System.out.println("16ת��Ϊ�˽��ƣ�"+octalValue);

		
	}	
}
