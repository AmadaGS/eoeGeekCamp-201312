package Exercise;
import java.util.Arrays;
public class Exercise07 {

	/**编程找三个数3，4，5的中间数。要求不能使用if、switch等判断语句。
	 * @param args
	 */
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		System.out.println(Math.max(3, 5));
//		System.out.println(Math.min(5, 3));
		int[] shu=new int[]{4,3,5};
		Arrays.sort(shu);
		System.out.println("中间数为："+shu[1]);
	}

}
