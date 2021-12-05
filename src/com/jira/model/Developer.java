package com.jira.model;

public class Developer extends User {
	
	String expertise;

	public Developer(String userId, String userName) {
		super(userId, userName);
		// TODO Auto-generated constructor stub
	}
	
	

	public Developer(String userId, String userName, String expertise) {
		super(userId, userName);
		this.expertise = expertise;
	}

	


	public String getExpertise() {
		return expertise;
	}



	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}



	@Override
	public String toString() {
		return "Developer [expertise=" + expertise + "]";
	}
	
	

}
