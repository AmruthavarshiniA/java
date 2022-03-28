package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserPersist {

	public static void main(String[] args) throws IOException {
		String[] skill= {"java","python"};
		User user=new User(101,"Santhosh","Santosh@mail.com","Banglore",skill);
		
		System.out.println(user);
		
		FileOutputStream fos=new FileOutputStream("userdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(user);
		System.out.println("done");
		
	}
}
