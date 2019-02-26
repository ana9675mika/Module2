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

//ye annotation server ko bolta h consider krne ko ki ye ek servlet class h and 
//ek hi object bnta h iska
//and agar web.xml bnayenge to is annotation ko comment krna pdega


public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			RequestDispatcher dispatch=request.getRequestDispatcher("/WEB-INF/pages/Welcome.jsp");////dispatch
			dispatch.forward(request, response);////dispatch
		
		
	System.out.println("IN SERVLET");
	
	
	
	
	
	
	}

}
