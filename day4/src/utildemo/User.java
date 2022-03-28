package utildemo;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable,Comparable<User>{

	@Override
	public int hashCode() {
		return Objects.hash(Email, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Email, other.Email) && userId == other.userId && Objects.equals(userName, other.userName);
	}

	private static final long serialVersionUID=1L; 
	private int userId;
	private String userName;
	private String Email;
	
	public String toString(){
		return "User [userId="+userId+",userName="+userName+",email="+Email+"] ";
	}
	
	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		Email = email;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public int compareTo(User o) {
		return this.getUserName().compareTo(o.getUserName());
	}

	
}
