package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.DAO.TodoDAO;
import com.todo.model.Todo;

@Service
public class TodoService {
	@Autowired
	private TodoDAO  repo;
	
	public List<Todo> viewItems(){
		return repo.findAll();
	}
	
	public Todo addItems(Todo item) {
		repo.save(item);
		return item;
	}
	
	public String deleteItem(int id){
		repo.deleteById(id);
		return "Success";
	}
	
	public Todo updateItem(Todo item) {
		repo.save(item);
		return item;
	}
	
}
