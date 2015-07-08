package com.demo.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyForEachClassic extends TagSupport {

	private int start;
	private int end;
	private String var;
	
	
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("### in doStartTag");
		pageContext.setAttribute(var, start);
		// return SKIP_BODY ; //doAfterBody won't invoke.
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("### in doAfterBody");

		if(start<end){
			start++;
			pageContext.setAttribute(var, start);
			return EVAL_BODY_AGAIN;
		}
		
		
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("### in doEndTag");

		return EVAL_PAGE;
	}

	
	
	
	
	
	public int getStart() {
		return start;
	}

	
	
	
	
	
	public void setStart(int start) {
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
