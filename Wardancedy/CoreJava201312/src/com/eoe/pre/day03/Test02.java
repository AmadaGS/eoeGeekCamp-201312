package com.eoe.pre.day03;

import java.util.Arrays;

import com.eoe.pre.day03.entity.User;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data="1001:уе╥и:1234:13010381038:zhangfei@eoemobile.com.cn";
		User user=new User();
		String[] strUser=data.split(":");
		System.out.println(Arrays.toString(strUser));
		user.id=Integer.parseInt(strUser[0]);
		user.name=strUser[1];
		user.password=strUser[2];
		user.phone=strUser[3];
		user.email=strUser[4];
		System.out.println(user);
//		System.out.println("user id="+user.id);
//		System.out.println("user name="+user.name);
//		System.out.println("user password="+user.password);
//		System.out.println("user phone="+user.phone);
//		System.out.println("user email="+user.email);
	}

}
