package com.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputDemo {	
	public static void main(String[] args) {		
		try {
			FileOutputStream fos=new FileOutputStream("test.text");
			String data="welcome to java";			
			byte b[]=data.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("data written");
		}catch (FileNotFoundException e) {
			
		}catch (IOException e) {
			
		}		
	}
}
