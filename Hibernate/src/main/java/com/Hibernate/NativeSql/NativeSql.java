package com.Hibernate.NativeSql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.Hibernate.Entity.Student;

public class NativeSql {

	public static void main(String[] args) {

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction txTransaction = session.beginTransaction();

		String queryString = "select * from Studnets";

		NativeQuery nativeQuery = (NativeQuery) session.createQuery(queryString);

		List<Object[]> list = nativeQuery.list();

		for (Object[] a : list) {
			System.out.println(a[2] + "  " + a[1]);
		}

		txTransaction.commit();

		session.close();
	}

}
