package Exerciseday05;

import java.util.Arrays;

public class Exercise10 {
	public static void main(String[] args) {
		int[] src={2,4,39,45,34,10};
		int[] dest=new int[5];
		dest=Arrays.copyOf(src,3);
		System.out.println( "src="+Arrays.toString(src));
		System.out.println("dest="+Arrays.toString(dest));
	}
		
}
