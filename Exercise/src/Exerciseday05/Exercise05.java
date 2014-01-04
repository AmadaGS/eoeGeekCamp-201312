package Exerciseday05;

import java.util.Arrays;

public class Exercise05 {
	public static void main(String[] args) {
//		int[] scores;//数组第一种定义方式，在栈空间中生命了数组变量
//		int scores2[];//数组定义的第二种方式，c风格
//		int[] scores3=new int[5];
//		//数组的动态初始化
//		int[] scores4=new int[]{85,77,93,62,90};
//		//数组的静态初始值
		int[] scores5= {85,77,93,62,90};
//		String text="abcdfg";
	//System.out.println(text.length());
		System.out.println(scores5.length);
		for (int i = 0; i < scores5.length; i++) {
		System.out.println(scores5[i]);	
		}
		//用循環遍歷史數組所有元素并打印
//		for (int i = 0; i < scores5.length; i++) {
//			System.out.println(scores5[i]);
//		}
		System.out.println(Arrays.toString(scores5));
//		int[] scores6={};//定義空數組
//		int[] scores7=new int[0];
//		//a(new int[]{85,77,93,62,90});
//	}
//	static void a(int[] scores){
//		System.out.println(scores[0]);
	}
}


