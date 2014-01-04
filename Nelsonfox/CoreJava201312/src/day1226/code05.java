package day1226;

public class code05 {

	public code05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 用三重循环查找100~999以内的所有水仙花数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {// i=1因为水仙花数是三位数，所以百位大于0
			for (int j = 0; j < 10; j++) {// 十位
				for (int k = 0; k < 10; k++) {// 个位
					int value = i * 100 + j * 10 + k;
					if (i * i * i + j * j * j + k * k * k == value) {
						System.out.println(value);
					}
				}
			}
		}
	}

}
