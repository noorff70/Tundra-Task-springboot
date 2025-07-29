package com.springboot.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.task.model.Task;
import com.springboot.task.service.TaskService;

/**
 * 
 * @author Faizul
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	/**
	 * Returns a list of task
	 * @return
	 */
	@GetMapping("/taskList")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
		
	}
	
	/**
	 * Retrieves a task by its id
	 * @param req
	 * @return
	 */
	
	@PostMapping("/getTaskById")
	public Task getTaskById (@RequestBody Task req) {
		
		Task task = null;
		int id = req.getTaskId();
		task = taskService.getTaskById(id);
		
		return task;
	}
	
	
	/**
	 * Removes a Task by its id
	 * @param req
	 * @return
	 */
	
	@PostMapping("/removeTask")
	public List<Task> removeTask(@RequestBody int id) {
		
		return  taskService.removeTaskById(id);
	}
	
	/**
	 * Add a task
	 * @param task
	 * @return
	 */
	@PostMapping("/addTask")
	public List<Task> addTask(@RequestBody Task task) {
		
		return taskService.addTask(task);
	}
	
	
	/**
	 * Update a Task
	 * @param task
	 * @return
	 */
	@PostMapping("/updateTask")
	public boolean updateTask(@RequestBody Task task) {
		boolean isTaskUpdated = taskService.updateTaskStatus(task);
		return isTaskUpdated;
	}

}
