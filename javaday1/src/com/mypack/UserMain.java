package com.mypack;

public class UserMain {
	public static void main(String[] args) {
		User user=new User();
		user.setuId(101);
		user.setuName("panka");
		user.setuEmail("panka@abc.com");
		System.out.println(user.getuId()+" "+user.getuName()+" "+user.getuEmail());
	}
}
