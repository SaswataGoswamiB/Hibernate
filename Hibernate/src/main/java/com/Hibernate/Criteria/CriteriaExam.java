package com.Hibernate.Criteria;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;



public class CriteriaExam {
	
	public static void main(String[] args) {
		
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		
//		//Transaction transaction=session.beginTransaction();
//		
//		//session.createCriteria(Student.class);
//		
//		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
//		
//		CriteriaQuery<Student> criteria=criteriaBuilder.createQuery(Student.class);
//		
//		Root<Student> employeeRoot=criteria.from(Student.class);
//		
//		
//		
//		//transaction.commit();
		session.close();
	}

	
	
	
	
	
}
