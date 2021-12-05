package com.jira.model;

import java.util.ArrayList;
import java.util.List;

public class Jira {
	
	List<Sprint> sprints;
	
	public Jira() {
		this.sprints = new ArrayList<>();
	}

	public Jira(List<Sprint> sprints) {
		super();
		this.sprints = sprints;
	}
	
	public List<Sprint> getSprints() {
		return sprints;
	}

	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	
	public void addSprint(Sprint sprint) {
		if(this.sprints==null) {
			this.sprints = new ArrayList<>();
		} 
		
		this.sprints.add(sprint);
	}

	@Override
	public String toString() {
		return "Jira [sprints=" + sprints + "]";
	}
	
	
	

}
