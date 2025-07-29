package com.springboot.task.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.task.dao.TaskDAO;
import com.springboot.task.model.Task;
import com.springboot.task.utility.DbUtility;

/**
 * 
 * @author Faizul
 *
 */

@Repository
public class TaskDAOImpl implements TaskDAO{

	@Override
	public List<Task> getAllTasks() {
		DbUtility db = new DbUtility();
		return db.getTaskList();
	}

	@Override
	public Task getTaskById(int taskId) {
		
		DbUtility db = new DbUtility();
		return db.getTaskById(taskId);
	}

	@Override
	public List<Task> removeTaskById(int taskId) {
		
		DbUtility db = new DbUtility();
		return db.removeTask(taskId);
	}

	@Override
	public List<Task> addTask(Task task) {
		DbUtility db = new DbUtility();
		return db.addTask(task);
	}

	@Override
	public boolean updateStatus(Task task) {
		DbUtility db = new DbUtility();
		return db.updateStatus(task);
	}

}
