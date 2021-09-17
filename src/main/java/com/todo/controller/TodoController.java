package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.Todo;
import com.todo.service.TodoService;

@RestController
public class TodoController {

	@Autowired
	private TodoService service;
	
	@GetMapping("/view")
	public List<Todo> viewItems(){
		return service.viewItems();
	}
	
	@PostMapping("/add")
	public Todo addItems(@RequestBody Todo item) {
		return service.addItems(item);
	}

	@PutMapping("/update")
	public Todo updateItem(@RequestBody Todo item) {
		return service.updateItem(item);
	}

	@DeleteMapping("/delete")
	public String deleteItem(@RequestBody int id) {
		return service.deleteItem(id);
	}

}
