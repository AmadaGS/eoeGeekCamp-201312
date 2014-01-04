package Exercise;

public class Exercise05 {

	/**编写Exercise05类，计算46天是几周零几天。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=46;
		int weeks=days/7;//计算49天为多少周
		days=days-weeks*7;//计算49天为多少天
		System.out.println(weeks+"周"+days+"天");
	}

}
