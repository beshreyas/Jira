package com.jira.service;

import java.util.List;

import com.jira.model.Jira;
import com.jira.model.Sprint;

public class JiraService {
	
	private Jira jira;
	
	public Jira createJira() {
		return new Jira();
	}
	
	public Jira createJiraWithSprints(List<Sprint> sprints) {
		jira = new Jira(sprints);
		return jira;
	}

}
