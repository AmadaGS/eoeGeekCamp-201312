package exerciseday06;

import java.util.Arrays;

public class Exercise08 {
public static void main(String[] args) {
	int[] a={32,65,45,52,97};
	System.out.println(Arrays.toString(a));
//	int i;
//	i=1;
//   int k=a[i];
//	int j;
//	for(j=i-1;j>=0&&k>a[j];j--){
//		a[j+1]=a[j];
//	}
//	a[j+1]=k;
//	  i++;//i=2
//	  k=a[i];
//	  for(j=i-1;j>=0&&k>a[j];j--){
//		  a[j+1]=a[j];
//	  }
//	  a[j+1]=k;
//	  i++;//i=3
//	  k=a[i];
//	  for(j=i-1;j>=0&&k>a[j];j--){
//		  a[j+1]=a[j];  
//	  }
//	  a[j+1]=k;
//	  i++;//i=4
//	  k=a[i];
//	  for(j=i-1;j>=0&&k>a[j];j--){
//		  a[j+1]=a[j];
//	  }
//	  a[j+1]=k;
	  for (int i = 1; i < a.length; i++) {
		//将a[i]的值保存在临时变量k中
		  int k=a[i];
		  int j;
		  //循环从i-1至0，循环继续的条件是j>=0并且k的值大于a[j]
		  for(j=i-1;j>=0&&k>a[j];j--){
			  a[j+1]=a[j];//每次数组元素的值一次后移一位
		  }
		  //循环结束后，将k的值插入至a[j+1],因为j的值多减了一次
		  a[j+1]=k;
	}
	  System.out.println(Arrays.toString(a));
}
}
