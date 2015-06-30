package com.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener{

	
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		
		 System.out.println("atributed added :: "+arg0.getName());
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
	

		 System.out.println("atributed removed :: "+arg0.getName());
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
	

		 System.out.println("atributed replaced :: "+arg0.getName());
		
	}
}
