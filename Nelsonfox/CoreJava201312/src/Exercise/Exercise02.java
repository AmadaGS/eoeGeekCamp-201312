package Exercise;

import java.util.Scanner;

public class Exercise02 {

	public Exercise02() {
		// TODO Auto-generated constructor stub
	}

	/**��д���㻪��ת��Ϊ�����¶ȵĳ��򣬹�ʽ�� �����¶�ֵ=�������¶�ֵ-32����5��9
            Ҫ��
   	 (1)������ʩ�¶��ɼ������롣
     (2)����С�����1λ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    double WenDu=scanner.nextDouble();
    double SheShiDu=(WenDu-32)*5/9;
    SheShiDu=100*Math.round(SheShiDu)/100;
    System.out.println((SheShiDu));
	}

}
