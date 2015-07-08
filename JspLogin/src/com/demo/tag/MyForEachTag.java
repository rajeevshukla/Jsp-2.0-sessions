package com.demo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyForEachTag extends SimpleTagSupport {

	private int start;
	private int end;
	private String var;

	  //1:- Constructor
	 //2:- SetJspContext
	 //3:- setParent () if there is nested tag. 
	 //4:- setters 
	//5:- setJspBody()
	//6:-  doTag();
	
	@Override
	public void setJspContext(JspContext pc) {
	   System.out.println("in jsp context");
		super.setJspContext(pc);
	}
	@Override
	public void setParent(JspTag parent) {
	
		System.out.println("in set parent");
		
		super.setParent(parent);
	}
	
	
	@Override
	public void setJspBody(JspFragment jspBody) {
			super.setJspBody(jspBody);
			
			System.out.println("inside jsp body.");
	}
	
	
	
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("in do tag.");
		for (int i = start; i <= end; i++) {
			getJspContext().setAttribute(var, i);
			getJspBody().invoke(null); //to invoke jsp body
			
			if(i==43){
				throw new SkipPageException(); //to skip entire jsp page throw this. 
			}
		//	getJspContext().getOut().println(i + "<br>");
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
     System.out.println("setters called");
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getVar() {
		return var;
	}
	
	public void setVar(String var) {
		this.var = var;
	}
}
