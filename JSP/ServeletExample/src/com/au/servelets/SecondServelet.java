package com.au.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(description = "second_servelet example", urlPatterns = { "/SecondServelet1" })

public class SecondServelet extends HttpServlet {
	
	public SecondServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);\
		System.out.print(req.getSession().getAttribute("key"));
	}
	
	

}
