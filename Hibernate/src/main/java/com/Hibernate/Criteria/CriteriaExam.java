package com.Hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Entity.Student;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaExam {
	
	public static void main(String[] args) {
		
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Transaction transaction=session.beginTransaction();
		
		//session.createCriteria(Student.class);
		
		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
		
		CriteriaQuery<Student> criteria=criteriaBuilder.createQuery(Student.class);
		
		Root<Student> employeeRoot=criteria.from(Student.class);
		
		
		
		//transaction.commit();
		session.close();
	}

	
	
	
	
	
}
