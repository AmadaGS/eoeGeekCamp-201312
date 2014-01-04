package exerciseday06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise11 {
	static final int SELECT_SORT=1;
	static final int BUBBLe_SORT=2;
	static final int INSERT_SORT=3;
	static final int QUICK_SORT=4;
	static final int COUNT_SORT=5;
	private static final int BUBBLE_SORT = 0;
public static void main(String[] args) {
	System.out.println("1-选择排序");
	System.out.println("2-冒泡排序");
	System.out.println("3-插入排序");
	System.out.println("4-快速排序");
	System.out.println("5-计数排序");
	System.out.println("选择1~5");
	int select=new Scanner(System.in).nextInt();
	switch (select) {
	case SELECT_SORT:
		selectSort();
		break;
	case BUBBLE_SORT:
		bubbleSort();
		break;
	case INSERT_SORT:
		insertSort();
		break;
	case QUICK_SORT:
		quickSort();
		break;
	case COUNT_SORT:
		countSort();
		break;
	}
}

private static void countSort() {
	int[] a=new int[20000000];
	Random random=new Random();
	for (int i = 0; i < a.length; i++) {
		a[i]=random.nextInt(101);
	}
	int[] b=new int[101];
	long start=System.currentTimeMillis();
	for (int i = 0; i < a.length; i++) {
		b[a[i]]++;
	}
	long end=System.currentTimeMillis();
	System.out.println("cost time:"+(end-start));
}

private static void quickSort() {
	int[] a=new int[20000000];
	Random random=new Random();
	for (int i = 0; i < a.length; i++) {
		a[i]=random.nextInt(101);
	}
	long start=System.currentTimeMillis();
	Arrays.sort(a);
	long end=System.currentTimeMillis();
	System.out.println("cost time:"+(end-start));
}

private static void insertSort() {
	int[] a=new int[200000];
	Random random=new Random();
	for (int i = 0; i < a.length; i++) {
		a[i]=random.nextInt(101);
	}
	long start=System.currentTimeMillis();
	for (int i = 1; i < a.length; i++) {
		int k=a[i];
		int j;
		for (j = i-1; j>=0&&k>a[j]; j--) {
			a[j+1]=a[j];
		}
		a[j+1]=k;
	}
	long end=System.currentTimeMillis();
	System.out.println("cost time:"+(end-start));
}

private static void bubbleSort() {
	int[] a=new int[200000];
	Random random=new Random();
	for (int i = 0; i < a.length; i++) {
		a[i]=random.nextInt(101);
	}
	long start=System.currentTimeMillis();
	for (int i = 1; i < a.length; i++) {
		for (int j = 0; j < a.length-i; j++) {
			if(a[j]<a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	long end=System.currentTimeMillis();
	System.out.println("cost time:"+(end-start));
}

private static void selectSort() {
	int[] a=new int[200000];
	Random random=new Random();
	for (int i = 0; i < a.length; i++) {
		a[i]=random.nextInt(101);
	}
	long start=System.currentTimeMillis();
	for (int i = 0; i < a.length-1; i++) {
		int index=i;
		for (int j = i+1; j < a.length; j++) {
			if(a[index]<a[j]){
				index=j;
			}
		}
		int temp=a[i];
		a[i]=a[index];
		a[index]=temp;
	}
	long end=System.currentTimeMillis();
	System.out.println("cost time:"+(end-start));
}

}
