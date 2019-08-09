package com.deloitte.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.deloitte.cms.config.AppConfiguration;
import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;
public class Client {

	public static void main(String[] args) {
		
		
		
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Customer customer= context.getBean(Customer.class);		
		Address address=context.getBean(Address.class);
		
		customer.setCustomerId(122);
	customer.setCustomerAddress("Mumbai");
		customer.setCustomerName("Kapoor");
		customer.setBillAmount(5066);
		
		address.setaId(12121);
	address.setCity("Pune");
		address.setState("Maharastra");
		
		//customer.setAddress(address);
	System.out.println(customer);
		
		context.registerShutdownHook(); 
		
 	}
}
