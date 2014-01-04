package Exercise1;
import java.util.Scanner;

public class Exercise008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x=个位=a/100;
		// y=十位=a%100/10;
		// z=百位=((a%100)%10);
		// system.out.print(z*100+y*10+x);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个四位数");
		
		int a=input.nextInt();
		int num4=a%10;//个位
		int num3=a%100/10;//十位
		int num2=a%1000/100;//百位
		int num1=a/1000;//千位
		int num=num4*1000+num3*100+num2*10+num1;
		System.out.println("反向输出的数字为"+ num);

	}

}
