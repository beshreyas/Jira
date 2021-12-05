package com.jira.model;

public class User {
	
	private final String userId;
	private String userName;
	
	
	
	public User(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}


	public String getUserId() {
		return userId;
	}



	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
	

}
