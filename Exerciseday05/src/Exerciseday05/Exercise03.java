package Exerciseday05;

import java.util.Scanner;

public class Exercise03 {
	/**
	 * ��ӡ����n��n�е��ַ�ͼ�Σ�n�ɼ�������
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 *     *****
	 */
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("n=");
	int n=scanner.nextInt();
	//����ѭ����ӡһ��*
	for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
	System.out.print("*");
	}
	System.out.println();
	}
//	System.out.println();
	}

}
