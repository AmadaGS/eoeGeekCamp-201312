package Exercise06_;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		String[] names={"张飞","刘亦菲","王菲","李三"};
		System.out.println(Arrays.toString(names));
//		Scanner scanner =new Scanner(System.in);
		Scanner scanner=new Scanner(System.in);
//		String name="张飞";
		//删除的位置
		System.out.println("输入删除的位置");
		int index=scanner.nextInt();
		for (int  i = index;  i < names.length;  i++) {
			names[i-1]=names[i];
			
		}
		names=Arrays.copyOf(names, names.length-1);
		System.out.println(Arrays.toString(names));

	}
}
