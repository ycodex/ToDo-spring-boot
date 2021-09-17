package com.todo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.model.Todo;

@Repository
public interface TodoDAO extends JpaRepository<Todo, Integer>{
	
}
