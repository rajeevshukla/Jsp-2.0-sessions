package com.demo.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewCardDetails
 */
@WebServlet("/viewCartDetails.htm")
public class ViewCartDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewCartDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 List<ProductDetails>  selectedProductList=new ArrayList<ProductDetails>();

		HttpSession session=request.getSession();
		Map<Integer, Integer> productIdProductCountMap=(Map<Integer, Integer>)session.getAttribute("cartInfo");
          
		if(null!=productIdProductCountMap && productIdProductCountMap.size()>0){
        	  
        	     for (Integer productId : productIdProductCountMap.keySet()) {
					
        	    	 ProductDetails existDetails=ApplicationUtils.productIdProductDetailsMap.get(productId);
        	    	 
        	    	 ProductDetails userSelectedProductDetails=new  ProductDetails(existDetails.getProductId(), existDetails.getProductName(),productIdProductCountMap.get(productId) , existDetails.getPrice()*productIdProductCountMap.get(productId));
        	    	
        	    	 selectedProductList.add(userSelectedProductDetails);
				}
              session.setAttribute("cartDetails", selectedProductList);        	  
          }

	       response.sendRedirect("viewCartDetails.jsp");
	}

}
