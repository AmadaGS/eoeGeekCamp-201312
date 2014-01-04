package com.eoe.pre.day03.entity;

public class Person_ {
	private String name;//姓名
	private char sex;//性别
	private int age;
	private double height;
	private String type;//性格
	//读方法
	public String getName(){
		return this.name;
	}
	//写方法
	public void setName(String name){
		this.name=name;
	}
	public char getSex(){
		return this.sex;
		
	}
	public void setSex(char sex){
		if(sex=='男' || sex=='女'){
			this.sex=sex;
		}else{
			this.sex='男';
		}
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		if(age>=0 && age<=200){
			this.age=age;
		}else{
			this.age=18;
		}
	}
	//定义带参构造(器)方法
	public Person_(String name,char sex,int age,
		double height,String type){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.height=height;
		this.type=type;
	}
	//方法名相同，参数不同，称为方法的重载。
	public Person_(){
		
	}
	//说话
	public void say(){
		System.out.println("嗨，大家好！俺叫"+
			name+",今年"+age+"岁,身高"+height+
			"米,俺是一个"+type+sex+"士");
	}
	//表达感情
	public void feeling(String cause,String content){
		System.out.println(cause);
		System.out.println(content);
	}
	public static void main(String[] args) {
		Person_ p1=new Person_("张飞",'男',33,1.99,"豪放的");
//		p1.name="张飞";
//		p1.sex='男';
//		p1.age=33;
//		p1.height=1.99;
//		p1.type="豪放的";
		p1.say();
		p1.feeling("俺中了五百万", "哈哈.....");
		
		Person_ p2=new Person_();
		p2.name="王菲";
		p2.sex='女';
		p2.age=30;
		p2.height=1.69;
		p2.type="温柔的";
		p2.say();
		p2.feeling("俺被评为歌后啦!", "嘿嘿.....");
		
		p1=new Person_();
		p1.name="刘亦菲";
		p1.sex='女';
		p1.age=28;
		p1.height=1.7;
		p1.type="文静的";
		p1.say();
		p1.feeling("俺被评为影后了", "呵呵.....");
	}
}
