package utildemo;

import java.util.TreeSet;

public class TreeSetDemo {


	public static void main(String[] args) {
		TreeSet<User> al=new TreeSet<User>();
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
