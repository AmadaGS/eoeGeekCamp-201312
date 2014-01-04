package day1227;

import java.util.Arrays;

public class Learn12 {

	public Learn12() {
		// TODO Auto-generated constructor stub
	}

	/**编写方法swap,交换两个变量值，测试盖房的交换结果
	 * @param args能否影响调用处 的值
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={50,40,30,20,10};
//打印swap()调用前数组的值
System.out.println("swap()调用前，数组a的值"+Arrays.toString(a));
swap(a[0],a[1]);
//打印swap()调用后的值
System.out.println("swap()调用后,数组a的值"+Arrays.toString(a));
	}
	//swap()交换两个变量的值，证明：不会改变两个的值
static void swap(int a1,int a2){
	int c=a1;
	a1=a2;
	a2=c;
}
}
