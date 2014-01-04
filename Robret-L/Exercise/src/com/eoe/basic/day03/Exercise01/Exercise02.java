package com.eoe.basic.day03.Exercise01;
import java.util.Scanner;
public class Exercise02 {
		/**
		 * 键盘输入5分制分数，根据以下标准给出成绩等级
		 * 5分：优秀
		 * 4分：良好
		 * 3分：及格
		 * 0～2分：不及格
		 */
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			System.out.println("输入百分制分数：");
			int score=scanner.nextInt();
			int grade=score/10;
			switch(grade){
			case 10:
		
			case 9:
				System.out.println("优秀");
				break;
			case 8:
			case 7:
				System.out.println("良好");
				break;
			case 6:
				System.out.println("及格");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("不及格");
				break;
			default:
				System.out.println("不符合百分之分数");
			
			}
		}

	}


