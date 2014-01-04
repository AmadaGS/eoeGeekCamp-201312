package exerciseday06;

import java.util.Arrays;

public class Exercise14 {
	/**
	 * 删除数组中重复的元素
	 * @author yw
	 *
	 */
	public static void main(String[] args) {
		int[] a={3,45,6,7,89,45,23};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]){
					a=delete(a,j);
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	private static int[] delete(int[]b,int j){
		for(int k=j;k<b.length-1;k++){
			b[k]=b[k+1];
		}
		b=Arrays.copyOf(b, b.length-1);
		return b;
	}
}
