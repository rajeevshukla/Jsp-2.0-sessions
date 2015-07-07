package com.demo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class OutputTag extends SimpleTagSupport {

	  @Override
	public void doTag() throws JspException, IOException {
	       
		  
		  getJspContext().getOut().println("your output tag has been exected. <br>");
		  System.out.println("your output tag has been exected. ");
		super.doTag();
	}
	
}
