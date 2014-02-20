package com.eoe.se2.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test002 {

	static final String PACK="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) throws ClassNotFoundException {

		Class clazz=Class.forName(PACK);
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
			System.out.println(c.getName());
			System.out.println("*********");
			
			int m=c.getModifiers();
			String permiss=Modifier.toString(m);
			System.out.println(permiss);
			StringBuilder constructorName=new StringBuilder(c.getName());
			constructorName=constructorName.delete(0, constructorName.lastIndexOf(".")+1);
			//System.out.println(constructorName);
			Class[] parames= c.getParameterTypes();
			//System.out.println(parames);
			StringBuilder p=new StringBuilder("(");
			for (int i = 0; i < parames.length; i++) {
				StringBuilder param=new StringBuilder(parames[i].getName());
				param.delete(0, param.lastIndexOf(".")+1);
				p.append(param+" arg"+i+",");
			}
			if(p.length()>1){
				p.deleteCharAt(p.length()-1);
			}
			p.append(")");
			System.out.println(permiss+" "+constructorName+p);
		}

	}

}
