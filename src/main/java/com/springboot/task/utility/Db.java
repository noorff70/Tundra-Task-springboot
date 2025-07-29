package com.springboot.task.utility;

import java.util.ArrayList;
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
		List<Task> taskList = new ArrayList<Task>();
			Task t1 = 	new Task(1, "Task 1 Desc", "Task 1 Name", true);
			Task t2 =	new Task(2, "Task 2 Desc", "Task 2 Name", false);
			Task t3 =	new Task(3, "Task 3 Desc", "Task 3 Name", false);
			Task t4 =	new Task(4, "Task 4 Desc", "Task 4 Name", false);
		
			taskList.add(t1);
			taskList.add(t2);
			taskList.add(t3);
			taskList.add(t4);
			setTaskList(taskList);
	}

	public List<Task> getTaskList() {
		return taskList;
	}
	
	public void setTaskList(List<Task> tasks) {
		this.taskList = tasks;
	}

}
