package com.demo.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet.htm")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName=request.getParameter("userName");
		String password=request.getParameter("userPassword");
		
		
		//check username & password in database. if correct add username in session. 
		 if(userName.equalsIgnoreCase("demo") && password.equalsIgnoreCase("demo")) {
			  HttpSession session=request.getSession();
			  session.setAttribute("userName", userName);
			  response.sendRedirect("welcome.jsp");
		 }else {
			 HttpSession session=request.getSession();
			 session.setAttribute("errorMsg", "Username or password don't match with database.");
			 response.sendRedirect("index.jsp");

		 }
		  
		

		
	}

}
