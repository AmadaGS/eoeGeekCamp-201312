package Exercise;

public class Exercise04 {

	/**
	 * 编写Exercise04类，计算以下公式，要求保留小数点后2位，对小数点后第三位四舍五入。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sqrt20 = Math.sqrt(20);
		double sqrt10 = Math.sqrt(10);
		double result = (sqrt20 + sqrt10) / (sqrt20 - sqrt10);
		System.out.println(result);
		System.out.println(Math.round(result * 100) / 100d);
	}

}
