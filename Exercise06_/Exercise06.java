package Exercise06_;

import java.util.Arrays;
import java.util.Random;

public class Exercise06 {
	/**
	 * 随机产生5个分数，，用冒泡方式降序排序。
	         要求：用双重循环完成排序。
	 */
	public static void main(String[] args) {
		Random random=new Random();
		
		int[] a=new int[5];//a数组有五个值
		for (int j = 0; j < a.length; j++) {
			a[j]=random.nextInt(41)+60;
		}
		System.out.println(Arrays.toString(a));	
		//用冒泡方式降序排序
		int temp=0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length-i; j++) {
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
