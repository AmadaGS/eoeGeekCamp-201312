package day0102.recursion;

public class recursion03 {

	public recursion03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;
		int y = f(5);
		System.out.print(y);

	}

	static int f(int n) {
		if (n == 1) {
			return 1;
		}
		int y = n + f(n - 2);
		return y;
	}
}
