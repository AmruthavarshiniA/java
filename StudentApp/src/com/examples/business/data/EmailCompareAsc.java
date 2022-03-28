package com.examples.business.data;

import java.util.Comparator;

public class EmailCompareAsc implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getEmail().compareTo(o2.getEmail());
	}
	

}
