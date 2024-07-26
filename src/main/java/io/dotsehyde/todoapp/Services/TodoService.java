package io.dotsehyde.todoapp.Services;

import io.dotsehyde.todoapp.Models.Todo;
import io.dotsehyde.todoapp.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    private static ArrayList<Todo> todos = new ArrayList<Todo>();

    static {
        todos.add(Todo.builder().id(1)
                .description("Golang").done(false)
                .targetDate(LocalDate.now().plusMonths(2))
                .username("Ben").build());
        todos.add(Todo.builder().id(2)
                .description("FullStack Development")
                .targetDate(LocalDate.now().plusMonths(3))
                .done(false)
                .username("Dan")
                .build()
        );
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }

    public List<Todo> getAll(){
        return todos;
    }
}
