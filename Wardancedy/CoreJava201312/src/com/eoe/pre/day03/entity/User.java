package com.eoe.pre.day03.entity;

//数据类
public class User {
	public int id;//编号
	public String name;
	public String password;
	public String phone;
	public String email;
	//Object;//JDK类的根类
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + ", email=" + email;
	}

}
