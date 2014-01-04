package exerciseday06;

import java.util.Arrays;

public class Exercise02 {
public static void main(String[] args) {
	int[] a={2,5,23,55,87};
	int i=1;
	int k=a[i];
	int j;
	for(j=i-1;j>=0&&k>a[j];j--){
		a[j+1]=a[j];
	}
	a[j+1]=k;
	//{2,5,23,55,87}
	i++;//i=2
	k=a[i];
	for(j=i-1;j>=0&&k>a[j];j--){
		a[j+1]=a[j];
	}
	 a[j+1]=k;
	 i++;//i=3
	 k=a[i];
	 for(j=i-1;j>=0&&k>a[j];j--){
		 a[j+1]=a[j];
	 }
	 a[j+1]=k;
	 i++;//i=4
	 k=a[i];
	 for(j=i-1;j>=0&&k>a[j];j--){
		 a[j+1]=a[j];
	 }
	 a[j+1]=k;
	 System.out.println(Arrays.toString(a));
}
}
