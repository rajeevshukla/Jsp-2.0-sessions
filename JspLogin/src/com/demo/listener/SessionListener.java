package com.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

	public static int count=0;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {

		System.out.println("session created.");
        count++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {

		System.out.println("session destroyed.");
          count--;
           if(count<0){
        	   count=0;
           }
	}
}
