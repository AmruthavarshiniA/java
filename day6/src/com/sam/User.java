package com.sam;

public class User {
	
		private int userId;
		private String userName;
		private String Email;
		
		
		public User(int userId, String userName, String email) {
			super();
			this.userId = userId;
			this.userName = userName;
			Email = email;
		}

		public String toString(){
			return "User [userId="+userId+",userName="+userName+",email="+Email+"] ";
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
		
}
