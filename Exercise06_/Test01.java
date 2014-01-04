package Exercise06_;

import java.util.Arrays;

public class Test01 {
	/**
	 * 数组扩容、减容示例
	 */
	public static void main(String[] args) {
		int[] a=new int[0];//创建一个空数组
		//数组a扩容
		a=Arrays.copyOf(a, a.length+1);
		a[0]=100;
		System.out.println("扩容后的数组a:"+Arrays.toString(a));
		//数组a减容
		a=Arrays.copyOf(a, a.length-1);
		System.out.println("减容后的数组a:"+Arrays.toString(a));
	}
}
