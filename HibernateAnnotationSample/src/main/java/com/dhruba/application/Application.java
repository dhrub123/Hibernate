package com.dhruba.application;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhruba.model.Employee;

public class Application {
	
final static Logger logger = LoggerFactory.getLogger(Application.class);
	
public static void main(String[] args) {
		
		
		
		try {
			
			logger.debug("starting hibernate application");
			Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			
			Employee naskar = new Employee();
			naskar.setId(12565);
			naskar.setName("Naskar");
			naskar.setDesignation("boy");
			naskar.setSalary(98765);
			
			Employee bhaskar = new Employee();
			bhaskar.setId(12563);
			bhaskar.setName("Bhaskar");
			bhaskar.setDesignation("napit");
			bhaskar.setSalary(88765);
			
			
			session.persist(naskar);
			session.persist(bhaskar);
			
			
			transaction.commit();
			session.close();
			
			
			
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}
	
	
}
