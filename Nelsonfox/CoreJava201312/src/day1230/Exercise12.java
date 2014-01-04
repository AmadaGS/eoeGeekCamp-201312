package day1230;

public class Exercise12 {

	public Exercise12() {
		// TODO Auto-generated constructor stub
	}

	/**递归方式求n!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double result=fact(4);
System.out.println("4!="+result);
}
	static double fact(int n){
		if(n==1){
			return 1;
		}
		double y=n*fact(n-1);
		return y;
	}

}
