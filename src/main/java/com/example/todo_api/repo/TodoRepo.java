package com.example.todo_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo_api.model.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long>{

}
