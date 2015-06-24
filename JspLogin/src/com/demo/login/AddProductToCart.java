package com.demo.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddProductToCart
 */
@WebServlet("/AddProductToCart.htm")
public class AddProductToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductToCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String productIdArrStr[] = request
				.getParameterValues("selectedProducts");

		int productIds[] = new int[productIdArrStr.length];

		int count = 0;
		for (String s : productIdArrStr) {
			productIds[count] = Integer.parseInt(s);
			count++;
		}
		HttpSession session=request.getSession();
		Map<Integer, Integer> selectProductIdSelectProductCountMap=null;
		
		selectProductIdSelectProductCountMap=(Map<Integer, Integer>)session.getAttribute("cartInfo");

		if(selectProductIdSelectProductCountMap==null){		  
			selectProductIdSelectProductCountMap=new  HashMap<Integer, Integer>();
			for (int id : productIds) {
				selectProductIdSelectProductCountMap.put(id, 1);
			}
		}else {
			for (int id : productIds) {
				 if( selectProductIdSelectProductCountMap.containsKey(id)){
					 selectProductIdSelectProductCountMap.put(id, selectProductIdSelectProductCountMap.get(id)+1);
				 }else {
					 selectProductIdSelectProductCountMap.put(id, 1);
				 }
			}
		}



		//productId // count
		session.setAttribute("cartInfo", selectProductIdSelectProductCountMap);

		response.sendRedirect("welcome.jsp");



	}

}
