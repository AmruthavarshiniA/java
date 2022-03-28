package utildemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	/*
	 1. it stores the value using zero based index
	2. it allows to have duplicate elements
	3. it gaurantees the order of its elements
	4. its very fast when u want data randomly 
	*/
	public static void main(String[] args) {
		
		ArrayList<User> al=new ArrayList<User>();
		al.add(new User(101,"adam","adam@mail.com"));
		al.add(new User(102,"chavi","chavi@mail.com"));
		al.add(new User(103,"tom","tom@mail.com"));
		al.add(new User(104,"advaith","advaith@mail.com"));
		
		Collections.sort(al,new NameOrder());
		
		for(User us:al) {	
		System.out.println(us);
		}
		
		System.out.println("get the user"+al.get(1));
		
		al.remove(0);
		
		for(User us:al) {	
			System.out.println(us);
			}
		
	}
}
