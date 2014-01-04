package day1230;

import java.util.Arrays;

public class Exercise14 {

	public Exercise14() {
		// TODO Auto-generated constructor stub
	}

	/**数组扩容，减容示例
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[0];
a=Arrays.copyOf(a, a.length+1);
a[0]=100;
System.out.println("扩容获得数组"+Arrays.toString(a));
a=Arrays.copyOf(a, a.length-1);
System.out.println("减容后的数组"+Arrays.toString(a));
	}

}
