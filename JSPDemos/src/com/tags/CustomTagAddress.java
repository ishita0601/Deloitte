package com.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagAddress extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
JspWriter out= pageContext.getOut();
try {
	out.println("<h2>Address of Deloitte</h2>");
	out.println("<h2>Deloitte C2</h2>");
	out.println("<h2>Divyasree Technopolis, Yemlur ,Bengaluru</h2>");
} catch (IOException e) {
e.printStackTrace();
}

		return super.doStartTag();
	}

	
}
