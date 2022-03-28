package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.hibernate.HibernateUtility;

public class DeleteDemo {

	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		
		Transaction tx=session.beginTransaction();
		Employee em=new Employee(102,"John","Mumbai");
		session.delete(em);
		tx.commit();
		System.out.println("user deleted");
	}
}
