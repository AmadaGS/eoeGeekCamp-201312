package day_01;

public class NO_7 {

	/**
	 * ��дExercise06�࣬����3712���Ǽ�С�������֡�����
	 */
	public static void main(String[] args) {
		int a;//ʱ
		int b;//��
		int c;//��
		int n=3712;
		a=(n/60)/60;
		b=(n-(a*60*60))/60;
		c=n-((a*60)*60)-(b*60);
		System.out.println("3712����"+a+"Сʱ"+b+"��"+c+"��");

	}

}
