package com.eoe.pre.day03.entity;

import com.eoe.pre.day03.Person;

public class Teacher extends Person{
	String inSchool;
	String worker;
	
	/**
	 * @param name
	 * @param sex
	 * @param age
	 * @param height
	 * @param type
	 * @param inSchool
	 * @param worker
	 */
	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		super(name, sex, age, height, type);
		this.inSchool = inSchool;
		this.worker = worker;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("俺在"+inSchool+"任"+worker);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher t=new Teacher("张大飞", '男', 35, 1.89, "稳重的", "eoe即可工作坊", "讲师");
		t.say();
		
	}

}
