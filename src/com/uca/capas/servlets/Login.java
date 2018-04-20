package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uca.capas.clases.User;

@WebServlet("/loginServlet")
public class Login extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<Integer,User> usersHashmap=new HashMap<Integer,User>();
		User user1=new User("Andres","axel","Admin");
		User user2=new User("Carla","yi","User");
		usersHashmap.put(1, user1);
		usersHashmap.put(2,user2);
		
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		int n=1;
		while(n<usersHashmap.size()) {
			if(user.equals(usersHashmap.get(n).getName()) && pass.equals(usersHashmap.get(n).getPass())) {
				PrintWriter out=response.getWriter();
				out.println("<html>");
				out.print("<body>");
				out.println("<b>"+"User Type: "+usersHashmap.get(n).getUserType()+"</b>");
				out.print("<body>");
				out.println("<html>");
				break;
			}
			n++;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}
	}


