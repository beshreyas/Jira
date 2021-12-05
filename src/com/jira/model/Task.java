package com.jira.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task {
	
	private final String taskId;
	private String taskTitle;
	private TaskStatus status;
	private String description;
	private User assignee;
	private ScrumMaster assigner;
	List<String> comments;
	List<File> attachments;
	
	
	public Task(String taskId) {
		super();
		this.taskId = taskId;
		this.status = TaskStatus.OPEN;
		this.comments = new ArrayList<>();
		this.attachments = new ArrayList<>();
	}


	public String getTaskTitle() {
		return taskTitle;
	}


	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}


	public TaskStatus getStatus() {
		return status;
	}


	public void setStatus(TaskStatus status) {
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public User getAssignee() {
		return assignee;
	}


	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}


	public ScrumMaster getAssigner() {
		return assigner;
	}


	public void setAssigner(ScrumMaster assigner) {
		this.assigner = assigner;
	}


	public List<String> getComments() {
		return comments;
	}


	public void setComments(List<String> comments) {
		this.comments = comments;
	}


	public List<File> getAttachments() {
		return attachments;
	}


	public void setAttachments(List<File> attachments) {
		this.attachments = attachments;
	}


	public String getTaskId() {
		return taskId;
	}
	
	public void addComment(String comment) {
		this.comments.add(comment);
	}
	
	public void addAttachment(File file) {
		this.attachments.add(file);
	}


	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskTitle=" + taskTitle + ", status=" + status + ", description="
				+ description + ", assignee=" + assignee + ", assigner=" + assigner + ", comments=" + comments
				+ ", attachments=" + attachments + "]";
	}
	
	

}
