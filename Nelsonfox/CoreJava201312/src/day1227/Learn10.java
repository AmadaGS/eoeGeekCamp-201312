package day1227;

import java.util.Arrays;
import java.util.Scanner;

public class Learn10 {

	public Learn10() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name={"张飞","王菲","刘亦菲","吗啡"};
//显示插入前的数组
System.out.println(Arrays.toString(name));
Scanner scanner=new Scanner(System.in);
System.out.println("输入差如的位置1~4");
int index;
do{
	index=scanner.nextInt();
}while(index<1 || index>4);
//name容量加1
name=Arrays.copyOf(name, name.length+1);
//index-1~name.length-1的元素一次后移
for(int i=name.length-1;i>=index;i--){
	name[i]=name[i-1];
}
//在index-1位置插入新元素
name[index-1]="咖啡";
//显示插入后的数组
System.out.println(Arrays.toString(name));
	}

}
