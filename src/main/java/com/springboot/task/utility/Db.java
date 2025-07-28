package com.springboot.task.utility;

import java.util.Arrays;
import java.util.List;

import com.springboot.task.model.Task;

/**
 * 
 * @author Faizul
 *
 */
public class Db {
	
	/** static instance*/
	private static Db Instance;
	private List<Task> taskList;
	
	
	/**
	 * create a private constructor
	 */
	private Db() {
		createTaskDb ();
	}
	
	/**
	 * Singleton Instance so that only one copy remains
	 * @return
	 */
	public static synchronized Db getInstance () {
		if (Instance == null) {
			Instance = new Db();
		}
		return Instance;
	}
	
	
	private void createTaskDb () {
		List<Task> taskList = Arrays.asList(
				new Task(1, "Task 1", "Task 1", false),
				new Task(1, "Task 2", "Task 2", false),
				new Task(1, "Task 3", "Task 3", false),
				new Task(1, "Task 4", "Task 4", false)
				);
		setTaskList(taskList);
	}

	public List<Task> getTaskList() {
		return taskList;
	}
	
	public void setTaskList(List<Task> tasks) {
		this.taskList = tasks;
	}

}
