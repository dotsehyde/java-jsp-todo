package io.dotsehyde.todoapp.Repository;

import io.dotsehyde.todoapp.Models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
