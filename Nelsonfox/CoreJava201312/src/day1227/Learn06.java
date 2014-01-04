package day1227;

import java.util.Arrays;

public class Learn06 {

	public Learn06() {
		// TODO Auto-generated constructor stub
	}

	/**Arrays.copy实例
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] src={3,4,5,7,8,12};
int[] dest=new int[5];
dest=Arrays.copyOf(src, 5);
System.out.println("src="+Arrays.toString(src));
System.out.println("dest="+Arrays.toString(dest));
	}

}
