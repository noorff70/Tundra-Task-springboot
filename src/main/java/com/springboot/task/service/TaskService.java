package com.springboot.task.service;

import java.util.List;

import com.springboot.task.model.Task;

/**
 * 
 * @author Faizul
 *
 */
public interface TaskService {
	
	public List<Task> getAllTasks();
	public Task getTaskById(int taskId);
	public boolean removeTaskById(int taskId);
	public boolean updateTaskStatus(Task task);
	public boolean addTask (Task task);
}
