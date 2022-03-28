package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Employee;
import com.hibernate.HibernateUtility;

public class LoadEmp {

	public static void main(String[] args) {
		
		Session session=HibernateUtility.getSession();
		Query query=session.createQuery("From Employee");
		List<Employee> lst=query.list();
		//for(Employee e:lst) {	
			System.out.println(lst);
		//}
	}
}
