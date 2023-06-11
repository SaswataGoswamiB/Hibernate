package com.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Entity.Address;
import com.Hibernate.Entity.Name;
import com.Hibernate.Entity.Project;
import com.Hibernate.Entity.Student;
import com.Hibernate.Entity.Subject;

public class Example {
	
	
	public static void main(String[] args) {
		
		Configuration cfgConfiguration=new Configuration();
		cfgConfiguration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfgConfiguration.buildSessionFactory();
		System.out.println("Session Factory is :"+sessionFactory);
		Session session=sessionFactory.openSession();
		org.hibernate.Transaction transaction= session.beginTransaction();
		
		Address address=new Address();
		address.setStateString("Bankura");
		address.setDistrictString("Bankura");
		
		//Project project=new Project();

		
		Name name=new Name();
		name.setFirstNameString("Saswata");
		name.setMiddleNameString("Kumar");
		name.setLastNameString("Goswami");
		
		Subject subject=new Subject();
		subject.setIsimportant(true);
		subject.setNameString("DB");
		
		Subject subject1=new Subject();
		subject1.setIsimportant(false);
		subject1.setNameString("Economics");
		
		List<Subject> alistList=new ArrayList<Subject>();
		alistList.add(subject);
		alistList.add(subject1);
		
		Student student=new Student();
		student.setAdd(address);
		student.setName(name);
		student.setSubjectList(alistList);
		
		
		
		
	
		
		System.out.println("Beginning Transaction !");
		
		session.save(address);
		session.save(subject);
		session.save(subject1);
	
		
		
		
		Student saStudent=new Student();
		saStudent.setAdd(address);
		saStudent.setName(name);
		
		session.save(saStudent);
		
		transaction.commit();
		session.close();
		
		System.out.println("Commit done!");
		
		
		
		
		
		
	
	}

}
