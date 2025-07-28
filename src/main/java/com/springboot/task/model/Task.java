package com.springboot.task.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Faizul
 *
 */

@Getter
@Setter
public class Task {
	
	private int taskId;
	private String taskDescription;
	private String taskName;
	private boolean taskStatus;
	
	public Task() {
	}
	
	public Task(int id, String desc, String name, boolean status) {
		taskId = id;
		taskDescription = desc;
		taskName = name;
		taskStatus = status;
	}

}
