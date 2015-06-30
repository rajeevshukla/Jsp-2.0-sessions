package com.demo.login;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserDetails  implements HttpSessionBindingListener{

	private String userId;
	private String password;
	private String role;

	public UserDetails(String userId, String password, String role) {
		this.userId = userId;
		this.password = password;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
	
		 paramHttpSessionBindingEvent.getName();
		 paramHttpSessionBindingEvent.getValue();
		
	}
	@Override
	public void valueUnbound(
			HttpSessionBindingEvent paramHttpSessionBindingEvent) {
          System.out.println("value unbound");
		

 		 paramHttpSessionBindingEvent.getName();
 		 paramHttpSessionBindingEvent.getValue();
 		
          
	}

}
