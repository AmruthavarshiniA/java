package utildemo;

import java.util.Comparator;

public class NameOrder implements Comparator<User> {
	
	public int compare(User o1, User o2) {
		
		return o1.getUserName().compareTo(o2.getUserName());
		
}
}
