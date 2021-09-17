package com.todo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
	@Id
	private int id;
	private String title;
	private String description;
	private Priority priority;
	private boolean completed;
	private Date dueDate;
}
