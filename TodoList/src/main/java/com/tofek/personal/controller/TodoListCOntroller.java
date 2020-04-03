/**
 * 
 */
package com.tofek.personal.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tofekkhan
 *
 */
@RestController
public class TodoListCOntroller {
	
	@PostMapping("/addTodo")
	public void addTodoList() {
		
	}
	@GetMapping("/updateTodo/{name}")
	public void updateTodoList(@PathVariable String name) {
		System.out.println("Todo List -"+name);
	}
	@DeleteMapping("/deleteTodo")
	public void deleteTodoList() {
		
	}
	
	@GetMapping("/getTodoList")
	public List getTodoList() {
		return null;
	}

}
