package com.eoe.pre.day01;
import java.util.Scanner;
public class Test10{
	public static void main(String[] args)
    {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("java=");
		int java=scanner.nextInt();
	    System.out.println("android=");
		int android=scanner.nextInt();
	    System.out.println("sql=");
		int sql=scanner.nextInt();
	    System.out.println("project=");
		int project=scanner.nextInt();
		if(java>=90 && android>=90 && sql>=90 && project>=90)
	   {System.out.println("��ϲ����������˾¼�ã���н8K");
	  }else if(java>=90 && android>=90 && sql>=90 || project>=90 )
	   {System.out.println("��ϲ����������˾¼�ã���н5K");
	  }else if(java>=90 || android>=90 || sql>=90 || project>=90)
	   {System.out.println("��ϲ����������˾¼�ã���н3K");
	  }else{System.out.println("��֪ͨ��");}
    }
     		   }
