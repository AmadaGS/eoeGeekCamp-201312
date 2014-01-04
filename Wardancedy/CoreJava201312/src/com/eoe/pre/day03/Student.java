package com.eoe.pre.day03;

public class Student {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inSchool;
	public String inClass;

	// ctrl+f6:快速切换至上一个类
	public Student(String name, char sex, int age, double height, String type,
			String inSchool, String inClass) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
		this.inSchool = inSchool;
		this.inClass = inClass;
	}
	public Student(){
		
	}

	// 说话
	public void say() {
		System.out.println("嗨，大家好！俺叫" + name + ",今年" + age + "岁,身高" + height
				+ "米,俺是一个" + type + sex + "士");
		System.out.println("俺在" + inSchool + inClass + "学习");
	}

	// 表达感情
	public void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// 计算n！
	public double fact(int n) {
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student("张小飞",'男',
			23,1.89,"狂放的","eoe极客工作坊","eoe20131205班");
		student.say();
		student.feeling("俺找到好工作啦","月薪8k");
	}

}
