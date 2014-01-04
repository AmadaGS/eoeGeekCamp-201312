package com.eoe.pre.day03;

public class Teacher {
	public String name;
	public char sex;
	public int age;
	public double height;
	public String type;
	public String inSchool;
	public String worker;//职务

	// ctrl+f6:快速切换至上一个类
	public Teacher(String name, char sex, int age, double height, String type,
			String inSchool, String worker) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.type = type;
		this.inSchool = inSchool;
		this.worker=worker;
	}
	public Teacher(){
		
	}

	// 说话
	public void say() {
		System.out.println("嗨，大家好！俺叫" + name + ",今年" + age + "岁,身高" + height
				+ "米,俺是一个" + type + sex + "士");
		System.out.println("俺在" + inSchool + "任"+worker);
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
		Teacher teacher = new Teacher("张大飞",'男',
			33,1.89,"狂放的","eoe极客工作坊","讲师");
		teacher.say();
		teacher.feeling("俺的学生找到好工作啦","月薪8k");
	}

}
