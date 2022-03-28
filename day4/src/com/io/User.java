package com.io;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2699546605527486468L;
	private int userId;
	private String userName;
	private String Email;
	private String city;
	private String[] skills;
	
	public String toString(){
		return "User [userId="+userId+",userName="+userName+",email="+Email+",skills"+skills+"] ";
	}

	public User(int userId, String userName, String email, String city, String[] skills) {
		super();
		this.userId = userId;
		this.userName = userName;
		Email = email;
		this.city = city;
		this.skills = skills;
	}

	
}

