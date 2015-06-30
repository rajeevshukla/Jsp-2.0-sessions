package com.demo.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	 * 
	 * @see HttpServlet#HttpServlet()
	 * 
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
		if(ApplicationUtils.USER_NAME_PASSWORD_MAP.containsKey(userName) && ApplicationUtils.USER_NAME_PASSWORD_MAP.get(userName).getPassword().equalsIgnoreCase(password) ) {


			UserDetails userDetails=ApplicationUtils.USER_NAME_PASSWORD_MAP.get(userName);

			HttpSession session=request.getSession(true);
			session.setAttribute("userName", userName);
             session.setAttribute("userDetails", userDetails);
			if(userDetails.getRole().equalsIgnoreCase("ROLE_ADMIN")){

 
				 response.sendRedirect("admin/welcomeAdmin.jsp");
 
			}else {

				List<ProductDetails> productList=new ArrayList<ProductDetails>();
				for (Integer productId : ApplicationUtils.productIdProductDetailsMap.keySet()) {
					productList.add(ApplicationUtils.productIdProductDetailsMap.get(productId));
				}
				session.setAttribute("productList", productList);
				response.sendRedirect("welcome.jsp");


			}


		}else {
			HttpSession session=request.getSession();
			session.setAttribute("errorMsg", "Username or password don't match with database.");
			response.sendRedirect("index.jsp");

		}




	}

}
