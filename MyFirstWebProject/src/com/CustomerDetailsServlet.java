package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;

/**
 * Servlet implementation class CustomerDetailsServlet
 */
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int customerId=Integer.parseInt(request.getParameter("customerId"));
	String customerName=request.getParameter("customerName");
	String customerAddress=request.getParameter("customerAddress");
	int billAmount=Integer.parseInt(request.getParameter("billAmount"));
	
//	response.setContentType("text/html");
//	response.getWriter().println("<h1>Hello"+ customerId+customerName+customerAddress+billAmount);
	
	Customer customer=new Customer();
	customer.setCustomerName(customerName);
	customer.setCustomerId(customerId);
	customer.setCustomerAddress(customerAddress);
	customer.getBillAmount();
	
	CustomerDAO customerdao=new CustomerDAOImpl();
	customerdao.insertCustomer(customer);
	}

}
