package com.au.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServelet
 */
@WebServlet(description = "first_servelet example", urlPatterns = { "/FirstServelet1" })
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generatedmethod stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// MIME

		response.setContentType("text/html");
		response.getWriter().append(request.getParameter("name"));
		response.getHeader("Post");
		//response.getWriter().append("koool");
		

		System.out.println(request.getParameter("country"));

		HttpSession session = request.getSession();
		session.setAttribute("key", request.getParameter("country"));

	}

	/*
	 * @Override public void service(ServletRequest req, ServletResponse res) throws
	 * ServletException, IOException { // TODO Auto-generated method stub
	 * super.service(req, res); }
	 */

}
