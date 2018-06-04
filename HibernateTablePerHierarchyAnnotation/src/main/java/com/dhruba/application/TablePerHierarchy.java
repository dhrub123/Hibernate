package com.dhruba.application;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhruba.model.Contractor;
import com.dhruba.model.Employee;
import com.dhruba.model.RegularEmployee;

public class TablePerHierarchy {
	
	final static Logger logger = LoggerFactory.getLogger(TablePerHierarchy.class);
	
	public static void main(String[] args) {
		
		
		Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee ram = new Employee();
		ram.setName("Ram");
		
		RegularEmployee bhanu = new RegularEmployee();
		bhanu.setName("Bhanu");
		bhanu.setBonus(2006);
		bhanu.setSalary(5678.54f);
		
		Contractor Sherlock = new Contractor();
		Sherlock.setName("Sherlock");
		Sherlock.setContractPeriod("12");
		Sherlock.setPayPerHour(23.45f);
		
		session.persist(ram);
		session.persist(bhanu);
		session.persist(Sherlock);
		
		transaction.commit();
		session.close();
	}

}
