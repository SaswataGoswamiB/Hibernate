package com.Hibernate.Hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Hibernate.Entity.Student;

import jakarta.persistence.Cacheable;

// implementation of ehcache.
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class HqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inisde the HQL class");
		
		Configuration cfgConfiguration=new Configuration();
		cfgConfiguration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfgConfiguration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		System.out.println("Creating Session");
		
		//HQL Syntax:
		
		//String queryString ="from Student_details";
		//String queryString="from Student_details as sd where sd.id='1'";
		String queryString="from Student_details as sd where sd.id=:x and sd.name.firstNameString=:b";
		Query<Student> aQuery= session.createQuery(queryString);
		aQuery.setParameter("x","1");
		aQuery.setParameter("b","Saswata");
		
		System.out.println("Query done!");
		
		//For Single result.
		//aQuery.uniqueResult();
		
		//Uing OPtional
		
		// Student student= aQuery.list().stream().findFirst().get();
		
		//For List of Students.
		List<Student>aliuStudents=aQuery.list();
		
		//Incase you had a Single Student Object
		
		//Student student=aQuery.uniqueResult();
		System.out.println("List runnign");
		
		System.out.println("The size is "+aliuStudents.size());
		for(Student student:aliuStudents)
		{
			
			System.out.println("First Id  is :"+student.getId());
			System.out.println("Name is "+student.getName().getFirstNameString()+" "+student.getName().getMiddleNameString());
		}
		
		System.out.println("List Done");
		session.clear();
		sessionFactory.close();
	}

}
