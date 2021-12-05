package com.jira.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.jira.exception.TaskAlreadyPresentException;
import com.jira.exception.UserAlreadyPresentException;

public class Sprint {
	
	private final String sprintId;
	private Set<User> users;
	private Set<Task> tasks;
	private HashMap<User,List<Task>> userTasksMap;
	private final Date sprintStartDate;
	private final Date sprintEndDate;
	private SprintStatus status;
	
	public Sprint(String id, Date sprintStartDate, Date sprintEndDate) {
		this.sprintId = id;
		this.sprintStartDate = sprintStartDate;
		this.sprintEndDate = sprintEndDate;
		this.status = SprintStatus.IN_PROGRESS;
		this.userTasksMap = new HashMap<>();
	}
	
	public Sprint(String id, Set<User> users, Set<Task> tasks, Date sprintStartDate, Date sprintEndDate) {
		super();
		this.sprintId = id;
		this.users = users;
		this.tasks = tasks;
		this.sprintStartDate = sprintStartDate;
		this.sprintEndDate = sprintEndDate;
		this.status = SprintStatus.IN_PROGRESS;
		this.userTasksMap = new HashMap<>();
	}

	public String getSprintId() {
		return sprintId;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
		for(User user : users) {
			userTasksMap.put(user, new ArrayList<>());
		}
	}
	
	public void addUser(User user) throws UserAlreadyPresentException {
		if(users==null) {
			this.users = new HashSet<>();
		}
		
		if(!users.contains(user)) {
			users.add(user);
			userTasksMap.put(user, new ArrayList<>());
		} else {
			throw new UserAlreadyPresentException();
		}
	}

	public Set<Task> getTasks() {
		return tasks;
	}
	
	public void addTask(Task task) throws TaskAlreadyPresentException {
		if(tasks==null) {
			this.tasks = new HashSet<>();
		}
		
		if(!tasks.contains(task)) {
			tasks.add(task);
			List<Task> userTasksList = userTasksMap.get(task.getAssignee());
			userTasksList.add(task);
			userTasksMap.put(task.getAssignee(), userTasksList);
		} else {
			throw new TaskAlreadyPresentException();
		}
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
		
		for(Task task : tasks) {
			if(userTasksMap.get(task.getAssignee())!=null) {
				List<Task> userTasksList = userTasksMap.get(task.getAssignee());
				userTasksList.add(task);
				userTasksMap.put(task.getAssignee(), userTasksList);
			}
		}
	}

	public Date getSprintStartDate() {
		return sprintStartDate;
	}


	public Date getSprintEndDate() {
		return sprintEndDate;
	}


	public SprintStatus getStatus() {
		return status;
	}

	public void setStatus(SprintStatus status) {
		this.status = status;
	}
	
	

	public HashMap<User, List<Task>> getUserTasksMap() {
		return userTasksMap;
	}

	@Override
	public String toString() {
		return "Sprint [users=" + users + ", tasks=" + tasks + ", sprintStartDate=" + sprintStartDate
				+ ", sprintEndDate=" + sprintEndDate + "]";
	}
	
	
	
	

}
