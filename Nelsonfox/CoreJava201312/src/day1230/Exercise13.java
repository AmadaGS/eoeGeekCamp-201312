package day1230;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {

	public Exercise13() {
		// TODO Auto-generated constructor stub
	}

	/**输入一个字母，统计该字母在以下英文中出现的所有位置
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
String text="father mother we are family";
System.out.println("输入一个字符:");
char c=scanner.next().charAt(0);
//创建一个空数组，用于统计该字符在字符串中出现的所有位置
int[] position={};
for(int i=0;i<text.length();i++){
	if(c==text.charAt(i)){
		//数组position容量加1
		position=Arrays.copyOf(position, position.length+1);
		position[position.length-1]=i;
	}
}
	}

}
