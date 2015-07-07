package com.demo.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyForEachTag extends SimpleTagSupport {

	private int start;
	private int end;

	@Override
	public void doTag() throws JspException, IOException {
		for (int i = start; i <= end; i++) {
			getJspContext().setAttribute("output", i);
			getJspBody().invoke(null); //to invoke jsp body
		//	getJspContext().getOut().println(i + "<br>");
		}
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

}
