package day_01;

public class NO_8 {

	/**
	 * �����������3��4��5���м�����Ҫ����ʹ��if��switch���ж���䡣
	 */
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=5;
        int min=a<b?a:b;
        int man=b<c?b:c;
        int m=min>man?min:man;
        System.out.println("�м�ֵ��"+m);
	}

}
