package com.example.todo_api.service;

import com.example.todo_api.model.Todo;
import java.util.List;
public interface TodoService {
    public Todo createTodo(Todo task);
    List<Todo>getAllTodo();

    public Todo updateTodo(Long id,Todo task);

    public void deleteTodo(Long id);
}
