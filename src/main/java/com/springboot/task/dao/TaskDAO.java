package com.springboot.task.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.task.model.Task;


/**
 * 
 * @author Faizul
 *
 */
@Repository
public interface TaskDAO {
	
	public List<Task> getAllTasks();
	public Task getTaskById(int taskId);
	public List<Task> removeTaskById(int taskId);
	public List<Task> addTask(Task task);
	public boolean updateStatus(Task task);
}
