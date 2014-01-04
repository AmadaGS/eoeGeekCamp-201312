package Exerciseday05;

import java.util.Arrays;

public class Exercise13 {
public static void main(String[] args) {
	int[] a=new int[0];//创建一个空数组
	//数组a扩容
	a=Arrays.copyOf(a, a.length+1);
	a[0]=100;
	System.out.println("扩容后的数组a:"+Arrays.toString(a));
	a=Arrays.copyOf(a, a.length-1);
	System.out.println("减容后的数组a:"+Arrays.toString(a));
}
}
