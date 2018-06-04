package com.dhruba.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dhruba.model.Employee;

public class HibernateTestInit {
	
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		try {
			
			Transaction transaction = session.beginTransaction();
			
			Employee employee = new Employee();
			employee.setId(1256);
			employee.setName("Dayita");
			employee.setDesignation("Chakor");
			employee.setSalary(98765);
			
			session.persist(employee);
			transaction.commit();
			
			
			
			
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally {
			session.close();
		}
		
		
		
		
		
	}

}
