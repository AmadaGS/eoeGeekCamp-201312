package day1231;

import java.util.Arrays;
import java.util.Random;

public class Exercise05 {

	public Exercise05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i;
		// int[] a=new int [5];
		// i=0;
		// System.out.println(Arrays.toString(a));
		// //最高分
		// for(int j=i+1;j<a.length;j++){
		// if(a[i]<a[j]){
		// int c=a[i];
		// a[i]=a[j];
		// a[j]=c;
		// }
		// }
		// i++;
		// //第二部分
		// for(int j=i+1;j<a.length;j++){
		// if(a[i]<a[j]){
		// int c=a[i];
		// a[i]=a[j];
		// a[j]=c;
		// }
		// }
		// i++;
		// //第三部分
		// for(int j=i+1;j<a.length;j++){
		// if(a[i]<a[j]){
		// int c=a[i];
		// a[i]=a[j];
		// a[j]=c;
		// }
		// }
		// i++;//第四部分
		// for(int j=i+1;j<a.length;j++){
		// if(a[i]<a[j]){
		// int c=a[i];
		// a[i]=a[j];
		// a[j]=c;
		// }
		// }
		int[] a = new int[10];
		Random random = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = random.nextInt(100);
		}
		System.out.println();
		Arrays.toString(a);
		// 排序
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
