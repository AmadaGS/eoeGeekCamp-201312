package day1230;

import java.util.Scanner;

public class Exercise04 {

	public Exercise04() {
		// TODO Auto-generated constructor stub
	}

	// /**不用判断语句，输入月份，显示天数，考虑闰年2月分的情况。
	// * @param args
	// */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] day = { 31,29 ,31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("请输入月份:");
		System.out.println("请输入年份:");
		int mouth = scanner.nextInt();//键盘输入月份
		
		if(mouth==2){//判断软年的情况
			int year=scanner.nextInt();//键盘输入年份
		
			if(year%400==0 || year%4==0&&year%100!=0){
				System.out.println("闰年"+29+"天");
				
			}else{
				System.out.println("平年"+day[1]+"天");
				
			}		
		}
		System.out.println(day[mouth - 1]);
	}

}
