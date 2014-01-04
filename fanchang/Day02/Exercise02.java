package com.eoe.basic.day02;
import java.util.Scanner;


public class Exercise02 {

	/**编写计算华氏转换为摄氏温度的程序，公式： 摄氏温度值=（华氏温度值-32）×5÷9
   要求：
   	 (1)华氏设施温度由键盘输入。
     (2)保留小数点后1位。
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入华氏温度值：");
			double t =scanner.nextDouble();
			double s = (t-32)*5/9;
			System.out.println("摄氏温度值是："+Math.round(s*10)/10d);

	}

}
