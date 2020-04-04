/**
 * 
 */
package com.tofek.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tofekkhan
 *
 */
@RestController
public class HelloWorldController {
	
	@PostMapping("/addTodo")
	public void addTodoList() {
		
	}
	@GetMapping("/updateTodo/{name}")
	public void updateTodoList(@PathVariable String name) {
		System.out.println("Todo List -"+name);
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
