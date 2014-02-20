package com.eoe.se2.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test05 {

	static final String PACKAGE="com.eoe.se2.day13.view.View";
	
	public static void main(String[] args) {
		
		try {
			Class clazz=Class.forName(PACKAGE);
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for (Constructor c : constructors) {
				//ªÒ»°∑√Œ –ﬁ Œ∑˚
				int m=c.getModifiers();
				String permiss=Modifier.toString(m);
				String cName=c.getName().substring(c.getName().lastIndexOf(".")+1);
				
				Class[] params = c.getParameterTypes();
				StringBuilder sb=new StringBuilder("(");
				for(int i=0;i<params.length;i++){
					String p=params[i].getName().substring(params[i].getName().lastIndexOf(".")+1);
					sb.append(p).append(" arg"+i+",");
				}
				if(params.length>0){
					sb.deleteCharAt(sb.length()-1);
				}
				sb.append(")");
				System.out.println(permiss+" "+cName+sb.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
