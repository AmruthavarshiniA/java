package utildemo;

//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Collections;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<User> al=new LinkedList<User>();
		al.add(new User(101,"adam","adam@mail.com"));
		al.add(new User(102,"chavi","chavi@mail.com"));
		al.add(new User(103,"tom","tom@mail.com"));
		al.add(new User(104,"advaith","advaith@mail.com"));
		
		al.addFirst(new User(105,"tomy","tomy@mail.com"));
		al.addLast(new User(106,"tomas","tomas@mail.com"));
		
		//Collections.sort(al,new NameOrder());
		
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
