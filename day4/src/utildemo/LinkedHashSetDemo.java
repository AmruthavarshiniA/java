package utildemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet <User> al=new LinkedHashSet<User>();
		
		al.add(new User(101,"adam","adam@mail.com"));
		al.add(new User(102,"chavi","chavi@mail.com"));
		al.add(new User(103,"tom","tom@mail.com"));
		al.add(new User(104,"advaith","advaith@mail.com"));
		al.add(new User(103,"tom","tom@mail.com"));
		
		for(User us:al) {	
			System.out.println(us);
			}
		System.out.println(al.size());
	}

}
