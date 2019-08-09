package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("1.init");
    	super.init();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gn=request.getParameter("guestname");
		String[] color1=request.getParameterValues("color");
		counter++;
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello "+gn+" in Parth's web site");
		//response.getWriter().println("<h1>You chose color"+color1[0]);
		response.getWriter().println("<h1>You are visitor number:"+ counter);
		
		if(gn.startsWith("a"))
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("HelloServlet");
			dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("HelloServletInvalid");
			dispatcher.forward(request, response);
		}
for(String c:color1)
{
	response.getWriter().println("<font color="+c+"Hello "+gn+" in Parth's web site</font>");
}
}}
