package com.fengleiit.pjo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		String[] names={"张飞","王菲","刘亦菲","吗啡"};
				System.out.println(Arrays.toString(names));
				Scanner scanner=new Scanner(System.in);
				System.out.println("请输入删除的位置(1~4):");
				int index=scanner.nextInt();
				for(int i=index;i<names.length;i++){
					names[i-1]=names[i];//数组中后面的赋值给前面的
				}				
				names=Arrays.copyOf(names, names.length-1);
			System.out.println(Arrays.toString(names));	
	}
}
