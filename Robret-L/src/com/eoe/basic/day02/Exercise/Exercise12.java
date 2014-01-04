package com.eoe.basic.day02.Exercise;

public class Exercise12 {
public static void main(String[] args) {
	boolean pass=true;//表示考试通过；
	System.out.println("考试合格："+pass);
	int score=59;
    pass=score>=60;
    System.out.println("考试合格："+pass);
}
}
