package com.app;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserDaoImpl implements UserDao{

	@Override
	public void addUser(User user) throws DAOException{
		
		try {
		FileOutputStream fos=new FileOutputStream("C:\\");
		//FileInputStream fis=new FileInputStream("C:\\");
		}catch (FileNotFoundException e) 
		{
			throw new DAOException
			("something wenr wrong...try after some time",e);
			//e.printStackTrace();
		}
	}

}
