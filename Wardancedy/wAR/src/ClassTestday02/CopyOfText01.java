package ClassTestday02;

public class CopyOfText01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double sqrt20 = Math.sqrt(20);
		double sqrt10 = Math.sqrt(10);
		double result = (sqrt20 + sqrt10) / (sqrt20 - sqrt10);
		System.out.println(result);
		System.out.println(Math.round(result * 10) / 10d);
	}

}
