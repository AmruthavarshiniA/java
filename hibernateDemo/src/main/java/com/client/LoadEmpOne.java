package com.client;

import org.hibernate.Session;

import com.entity.Employee;
import com.hibernate.HibernateUtility;

public class LoadEmpOne {
	
	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		Employee em=(Employee)session.get(Employee.class, 101);
		System.out.println(em.getEmpName());
	}

}
