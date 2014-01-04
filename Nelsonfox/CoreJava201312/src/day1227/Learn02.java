package day1227;

import java.util.Arrays;

public class Learn02 {

	public Learn02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={10,8,7,12,6};
int[] b=new int[10];
b=Arrays.copyOf(a, 4);
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));
	}

}
