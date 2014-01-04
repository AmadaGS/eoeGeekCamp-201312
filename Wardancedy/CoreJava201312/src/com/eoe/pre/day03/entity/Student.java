package com.eoe.pre.day03.entity;

import com.eoe.pre.day03.Person;

public class Student extends Person {
	String inSchool;
	String inClass;
	public Student(){
		
	}
	//alt+sift+s
	/**
	 * @param name:姓名
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 * @param inSchool
	 * @param inClass
	 */
	public Student(String name, char sex, int age,
			double height, String type,
			String inSchool, String inClass) {
		//Person类的带5个参数的构造器
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	@Override 
	//覆写或称重写
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("俺在"+inSchool+inClass+"学习");
	}

	// 计算n！
	public double fact(int n) {
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
		Student s = new Student("张小飞",'男',
			23,1.89,"狂放的","eoe极客工作坊","eoe20131205班");
		s.say();
		s.feeling("俺失恋啦", "哇哇...");
		System.out.println("下面给大家演示计算5！");
		System.out.println("5!="+s.fact(5));
	}
}
