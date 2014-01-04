package day1230;

public class Exercise09 {

	public Exercise09() {
		// TODO Auto-generated constructor stub
	}

	/**打印九九表
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[9][9];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print((i + 1) + "*" + (j + 1) + "=");
				if (a[i][j] < 10) {
					System.out.print("  ");
				}
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
