package Exerciseday05;

public class Exercise06 {
	/**
	 * ������ѭ����ӡ100��999
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {        //��ѭ����ʾ��λ��
			for (int j = 0; j <= 9; j++) {    //�м�ѭ����ʾʮλ��
				for (int k = 0; k <= 9; k++) {//��ѭ����ʾ��λ��
					System.out.print(i * 100 + j * 10 + k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
