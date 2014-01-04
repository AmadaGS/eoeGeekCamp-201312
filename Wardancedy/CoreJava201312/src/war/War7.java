package war;

import java.util.Scanner;

public class War7 {

	public War7() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("name=");
		String name=scanner.next();
		System.out.println("sex=");
	   char sex=scanner.next().charAt(0);
	   System.out.println("age=");
	   int age=scanner.nextInt();
	   System.out.println("height=");
	   double height=scanner.nextDouble();
	   System.out.println("大家好，我叫"+name+",今年"+age+",岁，身高"+height+"米，我是一个"+sex+"孩");
	}

}
