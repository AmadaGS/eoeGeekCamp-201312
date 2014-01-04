package day1226;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Code12 {

	public Code12() {
		// TODO Auto-generated constructor stub
	}

	/**数组扩容，减容
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[0];
		a = Arrays.copyOf(a, a.length + 1);
		a[0] = 100;
		System.out.println("扩容后的数组a：" + Arrays.toString(a));
		a = Arrays.copyOf(a, a.length - 1);
		System.out.println("减容后的数组:" + Arrays.toString(a));
	}

}
