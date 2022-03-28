package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {

	public static String acceptstring() {
		String stringdata=null;
		BufferedReader input=null;
		try {
			input=new BufferedReader(new InputStreamReader(System.in));
		    stringdata=input.readLine();
		}catch(IOException ioexception) {
			System.out.println("error in accepting data");
		}
		finally {
			if(input!=null) {
				input=null;
			}
		}
		return stringdata;
	}
}
