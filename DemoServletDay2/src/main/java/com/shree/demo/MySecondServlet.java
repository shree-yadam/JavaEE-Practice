package com.shree.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MySecondServlet")
public class MySecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	String mvName;
	
    public MySecondServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		mvName = request.getParameter("fullName");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("fullName");
		//mvName = request.getParameter("fullName");
		
		response.getOutputStream().print("Post is called ... value passed is " + name + " === " + mvName);
	}

}
