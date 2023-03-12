package com.shree.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyFirstServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// int val = 19 * 20;
		
		String val1 = request.getParameter("value1");
		Integer iVal1 = Integer.parseInt(val1);
		
		String val2 = request.getParameter("value2");
		Integer iVal2 = Integer.parseInt(val2);
		
		response.getWriter().append("Product of " + iVal1 + " and " + iVal2 + " is: " + (iVal1 * iVal2));
		
		// response.getWriter().append("Square of the number is: " + (iVal1 * iVal1));
		
		// response.getWriter().append("<h1>Hello World!!!</h1>  <h3><i>" + val + "</i></h3>");
	}

}
