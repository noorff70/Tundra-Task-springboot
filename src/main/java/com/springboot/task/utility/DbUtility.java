package com.springboot.task.utility;


import java.util.Iterator;
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
	public List<Task> addTask(Task task) {
		DbUtility db = new DbUtility();
		List<Task> taskList = db.getTaskList();
		boolean found = false;
		for (int i=0; i< taskList.size(); i++) {
			Task temp = taskList.get(i);
			if (temp.getTaskId() == task.getTaskId()) {
				taskList.set(i, task);
				found = true;
			}
		}
		if (found == false) {
			taskList.add(task);
		}
		
		
		Db.getInstance().setTaskList(taskList);

		return taskList;
	}
	
	/**
	 * Remove a Task from the list
	 * @param taskId
	 * @return
	 */
	public List<Task> removeTask(int taskId) {
		
		List<Task> taskList = getTaskList();
		
		Iterator<Task> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();

            if (task.getTaskId() == taskId) {
                iterator.remove();
            }
        }
		
		Db.getInstance().setTaskList(taskList);
		return taskList; 	
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

