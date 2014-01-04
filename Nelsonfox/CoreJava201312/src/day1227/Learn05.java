package day1227;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Learn05 {

	public Learn05() {
		// TODO Auto-generated constructor stub
	}

	/**attaycopy实例
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] src={3,4,5,7,9,12};
int[] dest=new int[5];
System.arraycopy(src, 1, dest, 0, 5);
System.out.println("src="+Arrays.toString(src));
System.out.println("dest="+Arrays.toString(src));
	}

}
