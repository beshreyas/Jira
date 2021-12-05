package com.jira.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.jira.model.Jira;
import com.jira.model.Sprint;
import com.jira.model.Task;
import com.jira.model.User;

public class DeveloperService {

	public List<Task> viewTasksAssigned(Jira jira, String sprintId, User user){
		
		List<Sprint> sprints = jira.getSprints();
		
		Sprint sprint = sprints.stream().filter(a -> a.getSprintId()==sprintId).findAny().get();
		
		HashMap<User,List<Task>> userTasksMap = sprint.getUserTasksMap();
		
		return userTasksMap.get(user);
		
	}
	
	
}
