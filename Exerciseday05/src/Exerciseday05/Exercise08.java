package Exerciseday05;

import java.util.Scanner;

public class Exercise08 {
	/*�ֳ���̣�����ٷ��Ƶķ�����
	 * 100~90:����
	 * 89-80:����
	 * 79-70:�е�
	 * 69-60:����
	 * 0��59:������
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����һ������Ʒ�����");
		int  score;
	    do{score =scanner.nextInt();
	    }while(score<0||score>5 );
	    String[] grades={"������","������","������","����","����","����"};
	    System.out.println(grades[score]);
		}
}
