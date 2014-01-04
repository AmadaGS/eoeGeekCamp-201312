package Exerciseday05;

import java.util.Arrays;

public class Exercise09 {
	/**
	 * arraycopy
	 */
	public static void main(String[] args) {	
	int[] src={20,3,8,6,3};
	int[] dest=new int[5];
	System.arraycopy(src, 0, dest, 2, 3);
	System.out.println(Arrays.toString(src));
	System.out.println(Arrays.toString(dest));
	}
}
