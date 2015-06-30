package com.demo.login;

import java.util.HashMap;
import java.util.Map;

public class ApplicationUtils {

	 public static Map<String, UserDetails> USER_NAME_PASSWORD_MAP =new HashMap<String, UserDetails>();
	 
	 public static Map<Integer, ProductDetails> productIdProductDetailsMap=new  HashMap<Integer, ProductDetails>();
	 
	  static {
		  USER_NAME_PASSWORD_MAP.put("user1", new UserDetails("user1", "test@1234", "ROLE_USER"));
		  USER_NAME_PASSWORD_MAP.put("user2", new UserDetails("user1", "test@1234", "ROLE_USER"));
		  USER_NAME_PASSWORD_MAP.put("user3", new UserDetails("user1", "test@1234", "ROLE_USER"));
		  USER_NAME_PASSWORD_MAP.put("admin1", new UserDetails("admin1", "test@1234", "ROLE_ADMIN"));
		  USER_NAME_PASSWORD_MAP.put("admin2", new UserDetails("admin2", "test@1234", "ROLE_ADMIN"));
		  USER_NAME_PASSWORD_MAP.put("admin3", new UserDetails("admin3", "test@1234", "ROLE_ADMIN"));
		  
		  productIdProductDetailsMap.put(1, new ProductDetails(1,"T shirts" ,20, 549.70));
		  productIdProductDetailsMap.put(2, new ProductDetails(2,"Shirt" ,20, 5409.70));
		  productIdProductDetailsMap.put(3, new ProductDetails(3,"Jeans" ,20, 5490.70));
		  productIdProductDetailsMap.put(4, new ProductDetails(4,"Wallets" ,20, 320.70));
		  productIdProductDetailsMap.put(5, new ProductDetails(5,"Belt" ,20, 50.70));
		  productIdProductDetailsMap.put(6, new ProductDetails(6,"Hankey" ,20, 590.70));
		  productIdProductDetailsMap.put(7, new ProductDetails(7,"Shoes" ,20, 543.70));
		  productIdProductDetailsMap.put(8, new ProductDetails(8,"shocks" ,20, 239.70));
		  productIdProductDetailsMap.put(9, new ProductDetails(9,"Watch" ,20, 6456.70));
		  
	  }
	
}
