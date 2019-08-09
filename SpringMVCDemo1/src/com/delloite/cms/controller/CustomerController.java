package com.delloite.cms.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;
import com.delloite.cms.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer ) 
	{
		//CustomerDAO customerDAO = new CustomerDAOImpl();
		customerService.insertCustomer(customer);
		return new ModelAndView("success","a",customer);
	}
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer ) 
	{
		//CustomerDAO customerDAO = new CustomerDAOImpl();
		customerService.updateCustomer(customer);
		return new ModelAndView("success","a",customer);
	}
	@RequestMapping("/searchCustomerbyid")
	public ModelAndView searchCustomerByIdForm()
	{
		return new ModelAndView("CustomerSearchById","command",new Customer());
	}
	@RequestMapping("/searchCustomerById")
	public ModelAndView searchCustomerbyid(Customer customer) throws SQLException
	{
		//CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer customer2=new Customer();
		customer2 = customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("CustomerSearchById","command",customer2);
	}
}