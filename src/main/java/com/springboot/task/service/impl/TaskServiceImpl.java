package com.springboot.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.task.dao.TaskDAO;
import com.springboot.task.model.Task;
import com.springboot.task.service.TaskService;

/**
 * 
 * @author Faizul
 *
 */

@Service("taskService")
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	TaskDAO taskDAO;

	@Override
	public List<Task> getAllTasks() {
		return taskDAO.getAllTasks();
	}

	@Override
	public Task getTaskById(int taskId) {
		return taskDAO.getTaskById(taskId);
	}

	@Override
	public List<Task> removeTaskById(int taskId) {
		return taskDAO.removeTaskById(taskId);
	}

	@Override
	public boolean updateTaskStatus(Task task) {
		return taskDAO.updateStatus(task);
	}

	@Override
	public List<Task> addTask(Task task) {
		return taskDAO.addTask(task);
	}

}
