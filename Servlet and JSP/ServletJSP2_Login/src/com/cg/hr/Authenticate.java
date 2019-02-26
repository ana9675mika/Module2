package com.cg.hr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//pick up Query String data (GET) 
		//pick up Form Data(POST)
		
		//for single data-----getParameter
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		////for multiple data-----getParameterValues
		///String[] string=request.getParameterValues(" ");
		
		RequestDispatcher dispatch=null;
		
		if(userName.equals("aa")&&(password.equals("aa")))
		{
			String fullName="aa aaa aaaa";
			
			//request scope
			request.setAttribute("fullName", fullName);
			dispatch=request.getRequestDispatcher("/WEB-INF/pages/MainMenu.jsp");
		}
		else
		{
			request.setAttribute("message", "Wrong Authentication. Pls Do Again.");
			dispatch=request.getRequestDispatcher("/WEB-INF/pages/Login.jsp");
		}
		dispatch.forward(request, response);
		//kisi b code m dispatching ek s jyada baar nhi chal skta
		
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+password);
	
	}

}
