package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	String[] names={"�ŷ�","�����","����","����"};
	System.out.println(Arrays.toString(names));
//	Scanner scanner =new Scanner(System.in);
	Scanner scanner=new Scanner(System.in);
//	String name="�ŷ�";
	//ɾ����λ��
	System.out.println("����ɾ����λ��");
	int index=scanner.nextInt();
	for (int  i = index;  i < names.length;  i++) {
		names[i-1]=names[i];
		
	}
	names=Arrays.copyOf(names, names.length-1);
	System.out.println(Arrays.toString(names));

}
}
