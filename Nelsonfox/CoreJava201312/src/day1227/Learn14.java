package day1227;

import java.util.Arrays;

public class Learn14 {

	public Learn14() {
		// TODO Auto-generated constructor stub
	}

	/**已知数组：int[] a={50,40,30,20,10};
	      将数组元素由左至右地交换，最后结果：
			a={10,20,30,40,50};
	      要求显示中间的交换过程，如下所示：
			[50, 40, 30, 20, 10]
			[40, 30, 20, 10, 50]
			[30, 20, 10, 40, 50]
			[20, 10, 30, 40, 50]
			[10, 20, 30, 40, 50]
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//打印数组的原始值
int[] a={50,40,30,20,10};
System.out.println(Arrays.toString(a));
//将a[0]移至a.length-1位置
for(int i=0;i<a.length-1;i++){
	swap(a,i,i+1);
}
System.out.println(Arrays.toString(a));
	}
//swap()交换两个变量值，数组作为参数，同时 接受两个元素的下标
	static void swap(int b[],int i,int j){
		int t=b[i];
		b[i]=b[j];
		b[j]=t;
	}
}
