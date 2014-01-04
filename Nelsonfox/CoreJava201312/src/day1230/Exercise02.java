package day1230;

public class Exercise02 {

	public Exercise02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 查找100～999之间的所有回文数。回文数是指： 数字左右对称，例如101,121,232
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {//取百位
			for (int j = 0; j <= 9; j++) {//取十位
				for (int k = 0; k <= 9; k++) {//取个位
					if (i - k == 0) {
						System.out.println(i * 100 + j * 10 + k);
					}
				}
			}
		}
	}

}
