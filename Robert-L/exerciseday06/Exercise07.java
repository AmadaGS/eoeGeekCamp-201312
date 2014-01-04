package exerciseday06;

import java.util.Arrays;
import java.util.Random;

public class Exercise07 {
public static void main(String[] args) {
	int[] a=new int[10];
	Random random =new Random();
	for (int j = 0; j < a.length; j++) {
		a[j]=random.nextInt(100);
	}
//	int i;
//	i=0;
	System.out.println(Arrays.toString(a));
//	//最高分
//	for (int j = i+1; j < a.length; j++) {
//		if(a[i]<a[j]){
//			int c=a[i];
//			a[i]=a[j];
//			a[j]=c;
//		}
//	}
//	i++;//i=1
//	//第二高分
//	for (int j = i+1; j < a.length; j++) {
//		if(a[i]<a[j]){
//			int c=a[i];
//			a[i]=a[j];
//			a[j]=c;
//		}
//	}
//	i++;//i=2
//	//第三高分
//	for (int j = i+1; j < a.length; j++) {
//		if(a[i]<a[j]){
//			int c=a[i];
//			a[i]=a[j];
//			a[j]=c;
//		}
//	}
	for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]){
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
