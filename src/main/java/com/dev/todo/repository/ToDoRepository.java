package com.dev.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.dev.todo.domain.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo,String> { }
