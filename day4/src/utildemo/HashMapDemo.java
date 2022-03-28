package utildemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,User> hm=new HashMap<Integer,User>();
		hm.put(10120,new User(101,"adam","adam@mail.com"));
		hm.put(10130,new User(102,"chavi","chavi@mail.com"));
		hm.put(10130,new User(103,"chav","chav@mail.com"));
		
		for(Map.Entry data:hm.entrySet()){
			System.out.println(data.getKey()+ " "+data.getValue());
		}
		
		System.out.println("get specific one"+ hm.get(10130));
		
		//System.out.println(hm);
	}
}
