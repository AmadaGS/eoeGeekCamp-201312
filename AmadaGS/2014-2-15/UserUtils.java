package com.eoe.se2.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class UserUtils {
	
	public HashMap<String, User> readUsers(InputStream in){
		HashMap<String, User> users=new HashMap<>();
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new InputStreamReader(in,"gbk"));
			String line;
			while((line=reader.readLine())!=null){
				User user=parse(line);
				users.put(user.getName(), user);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return users;
	}

	private User parse(String line) {
		String[] data=line.split(":");
		User user=new User();
		user.setId(Integer.parseInt(data[0]));
		user.setName(data[1]);
		user.setPwd(data[2]);
		user.setPhone(data[3]);
		user.setEmail(data[4]);
		return user;
	}
	
	public void saveUsers(HashMap<String, User> users){
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("D:/JAVA_Test/se2/day10/user.dat"));
			for (Map.Entry<String, User> entry : users.entrySet()) {
				User user=entry.getValue();
				oos.writeObject(user);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null){
					oos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
