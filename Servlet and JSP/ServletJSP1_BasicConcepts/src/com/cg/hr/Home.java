package com.cg.hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomePage")

///ye annotation server ko bolta h consider krne ko ki ye ek servlet class h and 
//ek hi object bnta h iska
//and agar web.xml bnayenge to is annotation ko comment krna pdega


public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
	out.print("<HTML>");
		out.print("<HEAD>");
			out.print("<TITLE> HR Application </TITLE>");
		out.print("<BODY>");
			out.print("<h1> Capgemini India </h1>");
			//out.print("<a href=\'Welcome.jsp\'>Welcome </a>");///////hyperlink
			//response.sendRedirect("Welcome.jsp");////////////////////redirect
			RequestDispatcher dispatch=request.getRequestDispatcher("Welcome.jsp");////dispatch
			dispatch.forward(request, response);////dispatch
		
		out.print("</BODY>");
		out.print("</HEAD>");
	out.print("</HTML>");
	System.out.println("IN SERVLET");
	
	
	
	
	
	
	}

}
