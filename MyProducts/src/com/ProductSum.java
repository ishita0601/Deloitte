package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductSum
 */
public class ProductSum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductSum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		PrintWriter out= response.getWriter();
		out.println(session.getAttribute("uname")+"your selected products");
		int total=0;
				int productCount=0;
		String selectedProducts[]=request.getParameterValues("product");
		if(selectedProducts==null)
		{
			out.println("no shopping done<a href=product.html>select products<a/>");
		}
		{
			for(String product:selectedProducts)
			{
				productCount++;
				total+=10;
				out.println("Productlist : "+productCount+"--"+product);
			}
		}
		session.setAttribute("totalAmount", total);

	out.println("<a href=PaymentServlet>Payment</a>");
	}

}
