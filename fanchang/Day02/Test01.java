package com.eoe.basic.day02;

public class Test01 {

	/**
	 * 一些例子的测试
	 * @param args
	 */
	public static void main(String[] args) {
			byte a=5;
			byte b=(byte) (a+3);
			System.out.println(b);//数值类型需进行强制转换
			
			double d = 2.6;
			double e = d-2;
			System.out.println("d-2:"+e);//浮点运算有误差
			
			System.out.println("\t俺在第是11个位置开始显示哦！");// \t 制表符向右跳十个字符
			System.out.print("下一个输出的和我不在同一行\n");      // \n回车换行
			System.out.println("\"双引号和我一起输出啦\"");           // \"表示双引号
			System.out.println("显示下一个路径：d:\\java\\basic\\day01");   //     \\表示\

	}

}
