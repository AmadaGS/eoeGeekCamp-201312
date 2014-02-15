package com.eoe.se2.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HashMap<String, User> users;
       UserUtils  userutils;
    
    public Test() {
        super();
        ObjectInputStream ois=null;
        File file=new File("D:/JAVA_Test/se2/day10/user.dat");
        if(!file.exists()){
        	InputStream in=this.getClass().getClassLoader().getResourceAsStream("user.txt");
        	userutils =new UserUtils();
        	users=userutils.readUsers(in);
        }else{
        	try {
				ois=new ObjectInputStream(new FileInputStream(file));
				User user;
				users = new HashMap<>();
				while((user=(User)ois.readObject())!=null){
					users.put(user.getName(), user);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(ois!=null){
						ois.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
        }
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		User user=new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setPwd(request.getParameter("pwd"));
		user.setPhone(request.getParameter("phone"));
		user.setEmail(request.getParameter("email"));
		users.put(user.getName(), user);
		userutils.saveUsers(users);
		byte[] data="×¢²á³É¹¦".getBytes("utf-8");
		response.getOutputStream().write(data);
		
	}

}
