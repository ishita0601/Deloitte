package com.deloitte.cms.client;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.EmployeeDetails;
import com.deloitte.cms.model.Address;

public class Client {

	public static void main(String[] args) {
		
		
		//hibernate.cfg.xml - and creates db connection
		Configuration configuration =new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Set allAddress=new HashSet();
		
		EmployeeDetails emp1=new EmployeeDetails(1,"Arun",96000);
		EmployeeDetails emp2=new EmployeeDetails(2,"Raj",66000);
		EmployeeDetails emp3=new EmployeeDetails(3,"Priya",24000);
		
		Address address1=new Address(1,"Hyd","Telagana");
		Address address2=new Address(2,"Raj","Jaipur");
		
		allAddress.add(address1);
		allAddress.add(address2);
		
		emp1.setemployeeAddress(allAddress);
		emp2.setemployeeAddress(allAddress);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);

		System.out.println("Your data is recoverd successfully!!");
		transaction.commit();

		transaction.commit();
		session.close();
		factory.close();
		
 	}
}
