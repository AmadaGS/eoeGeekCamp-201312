package day1227;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Learn11 {

	public Learn11() {
		// TODO Auto-generated constructor stub
	}

	/**删除数组中的元素
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name={"张飞","王菲","刘亦菲","咖啡","吗啡"};
Scanner scanner=new Scanner(System.in);
System.out.println("输入要删除的位置(1-"+name.length+")");
int index;
do{
	index=scanner.nextInt();
}while(index<0 || index>name.length);
for(int i=index;i<name.length-1;i++){
	name[i-1]=name[i];
}
name=Arrays.copyOf(name, name.length-1);
System.out.println(Arrays.toString(name));
	}

}
