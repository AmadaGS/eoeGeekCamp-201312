package Exercise06_;

public class Exercise01 {
	/**
	 * 查找100～999之间的所有回文数。
	 */
	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					int value = i * 100 + j * 10 + k;
					if (i == k) {
						System.out.print(value + " ");
						if (count == 10) {
							System.out.println();
							count = 1;

						} else {
							count++;
						}
					}
				}
			}
		}

		System.out.println();
	}

}
