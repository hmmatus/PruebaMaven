package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Colors
 */
@WebServlet("/Colors")
public class Colors extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ArrayList<String> colors=new ArrayList<String>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Colors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		colors.add("#304FFE");
		colors.add("#6200EA");
		colors.add("#0091EA");
		colors.add("#00B8D4");
		colors.add("#00BFA5");
		Random rand=new Random();
		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.print("<body bgcolor="+colors.get(rand.nextInt(colors.size()))+">");
		out.print("<form action=\"index.jsp\">");
		out.print("<input type=\"Submit\">");
		out.print("</form>");
		out.print("<body>");
		out.println("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
