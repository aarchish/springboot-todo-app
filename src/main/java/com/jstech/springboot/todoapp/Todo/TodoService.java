package com.jstech.springboot.todoapp.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;

    static {
        todos.add(new Todo(
                ++todoCount,
                "aarchish",
                "Learn Spring Boot",
                LocalDate.now().plusMonths(1),
                false
        ));
        todos.add(new Todo(
                ++todoCount,
                "aarchish",
                "Learn Full Stack Development",
                LocalDate.now().plusMonths(1),
                false
        ));
        todos.add(new Todo(
                ++todoCount,
                "aarchish",
                "Learn React.JS",
                LocalDate.now().plusMonths(1),
                false
        ));
    }

    private final int todosCount = 0;

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo newTodo = new Todo(++todoCount, username, description, targetDate, done);
        todos.add(newTodo);
    }

    public void deleteById(int id) {
        // lambda function to loop through all the IDs until function argument is a match
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        // lambda function to loop through all the IDs until function argument is a match
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo returnTodo = todos.stream().filter(predicate).findFirst().get();
        return returnTodo;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
