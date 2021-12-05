package com.jira.model;

public class ScrumMaster extends User {
	
	private int experience;

	@Override
	public String toString() {
		return "ScrumMaster [experience=" + experience + "]";
	}

	public ScrumMaster(String userId, String userName) {
		super(userId, userName);
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
