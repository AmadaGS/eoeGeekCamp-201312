package day1226;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Code01 {

	public Code01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = { 3, 4, 5, 7, 9, 12 };
		int[] dest = Arrays.copyOf(src, 6);
		System.out.println("src=" + Arrays.toString(src));
		System.out.println("dest=" + Arrays.toString(dest));
	}

}
