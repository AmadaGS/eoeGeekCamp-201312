package day1227;

import java.util.Arrays;

public class Learn13 {

	public Learn13() {
		// TODO Auto-generated constructor stub
	}

	/**编写方法swap，交换两个变量值，测试该方法的交换结果
	 * @param args能否影响调用出的变量
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={50,40,30,20,10};
//打印swap()调用前的值
System.out.println("swap()调用前，数组a的值"+Arrays.toString(a));
swap(a,0,1);//将数组a的地址和两个数组元素下标传递给swap()
System.out.println("swap()调用后，数组a的值"+Arrays.toString(a));
	}//swap()交换两个变量值，数组作为参数，同时接受两个元素的下标
	static void swap(int b[],int i,int j){
		//交换b[i]和b[j]的值
		int c=b[i];
		b[i]=b[j];
		b[j]=c;
	}

}
