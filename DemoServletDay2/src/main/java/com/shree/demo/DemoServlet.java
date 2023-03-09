package com.shree.demo;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String st = "ABC";
    
    public DemoServlet() {
        super();
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
	}
	
	

//	@Override
//	public ServletConfig getServletConfig() {
//		return super.getServletConfig();
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value1 = request.getParameter("key1"); 
		String value2 = request.getParameter("key2");
		
		
		if(value1.equalsIgnoreCase("shree")) {
			value2 = value2 + 100;
			st = "Hello";
		} else {
			value2 = value2 + value1;
			st = "How are you?";
		}
		
		String host = request.getHeader("Host");
		
		response.getOutputStream().print(value1 + " === " + st + " === " + host + " === " + value2);
		
		displayLocalTime();
	}

	private void displayLocalTime() {
		System.out.println(LocalDateTime.now());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
