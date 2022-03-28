package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Employee;
import com.hibernate.HibernateUtility;

public class LoadByName {

	public static void main(String[] args) {
		
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery("From Employee where empName=:name");
		query.setParameter("name", "Jhon");
		List<Employee> lst=query.list();
		for(Employee e:lst) {
			System.out.println(e);
		}
	}
}
