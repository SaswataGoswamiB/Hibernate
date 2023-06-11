package com.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Entity.Address;
import com.Hibernate.Entity.Name;
import com.Hibernate.Entity.Subject;

;

public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfgConfiguration=new Configuration().configure("hibernate.cfg.xml");
		Session session=cfgConfiguration.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Address address=new Address();
		address.setStateString("Kolkata");
		address.setDistrictString("Kolkata");
		
		Name name=new Name();
		name.setFirstNameString("Arpita");
		name.setMiddleNameString("Kumar");
		name.setLastNameString("Biswas");
		
		
		Subject subject=new Subject();
		subject.setIsimportant(true);
		subject.setNameString("Java");
		
		Subject subject1=new Subject();
		subject.setIsimportant(false);
		subject.setNameString("CA");
		
		List<Subject> bList=new ArrayList<Subject>();
		bList.add(subject);
		bList.add(subject1);
		
		
		
		transaction.commit();
		session.close();
	}

}
