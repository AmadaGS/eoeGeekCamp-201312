package day0102.recursion;

public class recursion01 {

	public recursion01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * fact()递归的方式求n!
	 * 
	 * @param n
	 * @return
	 */
	public static void main(String[] args) {
		double result = fact(4);
		System.out.println("4!=" + result);
	}

	static double fact(int n) {
		if (n == 1) {
			return 1;
		}
		double result = n * fact(n - 1);
		return result;
	}

}
