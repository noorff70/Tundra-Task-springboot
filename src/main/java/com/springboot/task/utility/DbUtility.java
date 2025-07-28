package com.springboot.task.utility;


import java.util.List;

import com.springboot.task.model.Task;

/**
 * 
 * @author Faizul
 *
 */
public class DbUtility {
	
	/**
	 * Return all the tasks
	 * @return
	 */
	public List<Task> getTaskList() {
		
		List<Task> taskList = Db.getInstance().getTaskList();
		return taskList;
	}
	
	/**
	 * Retrieve a Task
	 * @param taskId
	 * @return
	 */
	public Task getTaskById(int taskId) {
		
		List<Task> taskList = Db.getInstance().getTaskList();
		for (Task task: taskList) {
			if (task.getTaskId() == taskId)
				return task;
		}
		return null;
	}
	
	/**
	 * Add a new Task
	 * @param task
	 * @return
	 */
	public boolean addTask(Task task) {
		DbUtility db = new DbUtility();
		List<Task> taskList = db.getTaskList();
		taskList.add(task);
		
		Db.getInstance().setTaskList(taskList);

		return true;
	}
	
	/**
	 * Remove a Task from the list
	 * @param taskId
	 * @return
	 */
	public boolean removeTask(int taskId) {
		
		List<Task> taskList = Db.getInstance().getTaskList();
		int index =0;
		boolean found = false;
		for (; index< taskList.size(); index++) {
			Task task = taskList.get(index);
			if (task.getTaskId() == taskId) {
				taskList.remove(index);
				found = true;
				break;
			}
		}
		
		Db.getInstance().setTaskList(taskList);
		return found; 	
	}
	
	/**
	 * Update a task status
	 * @param tempTask
	 * @return
	 */
	public boolean updateStatus(Task tempTask) {
		DbUtility db = new DbUtility();
		List<Task> taskList = db.getTaskList();
		
		for (int i=0; i< taskList.size(); i++) {
			Task task = taskList.get(i);
			if (tempTask.getTaskId() == task.getTaskId()) {
				task.setTaskStatus(tempTask.isTaskStatus());
			}
		}
		Db.getInstance().setTaskList(taskList);
		return true;
	}

}

