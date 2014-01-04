package com.eoe.basic.day03.Exercise01;

public class Exercise06 {
	
	public static void main(String[] args) {
		IsleapYear(0);
	//Scanner scanner=new Scanner(System.in);
	//System.out.println("输入年份:");
    //int year=scanner.nextInt();
	}	
	private static boolean IsleapYear(int year) {
		
		if(year%400==0 || year%4==0&&year%100!=0){
			System.out.println("闰年");
			return true ;
			}else{
			System.out.println("平年");
			return false;	
		
		}


	}
}
