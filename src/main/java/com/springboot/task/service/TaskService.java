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
	public List<Task> removeTaskById(int taskId);
	public boolean updateTaskStatus(Task task);
	public List<Task> addTask (Task task);
}
