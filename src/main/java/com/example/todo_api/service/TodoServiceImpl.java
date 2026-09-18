package com.example.todo_api.service;

import org.springframework.stereotype.Service;

import com.example.todo_api.model.Todo;
import com.example.todo_api.repo.TodoRepo;
import java.util.List;

@Service 
public class TodoServiceImpl implements TodoService {
    private TodoRepo todoRepo;
    
    public TodoServiceImpl(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }
    @Override 
    public Todo createTodo(Todo task){
        return todoRepo. save(task);
    }
    @Override 
    public List<Todo> getAllTodo(){
        return todoRepo.findAll();
    }

    public Todo updateTodo(Long id,Todo task){
        Todo exTodo = todoRepo.findById(id).orElse(null);
        if(exTodo==null)
            return null;
        exTodo.setTask(task.getTask());
        return todoRepo.save(exTodo);
    }
    @Override 
    public void deleteTodo(Long id){
        todoRepo.deleteById(id);
    }
}
