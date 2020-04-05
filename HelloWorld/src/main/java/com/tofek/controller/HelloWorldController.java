/**
 * 
 */
package com.tofek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tofek.service.HelloWorldService;

/**
 * @author tofekkhan
 *
 */
@RestController
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@PostMapping("/addTodo")
	public void addTodoList() {
		
	}
	@GetMapping("/updateTodo/{name}")
	public void updateTodoList(@PathVariable String name) {
		System.out.println("Todo List -"+name);
		helloWorldService.getTodoList();
	}
	
	// Need to update @DeleteMapping
	@GetMapping("/deleteTodo")
	public void deleteTodoList() {
		System.out.println("I am in delete method");
	}
	
	@GetMapping("/getTodoList")
	public List getTodoList() {
		return null;
	}


}
