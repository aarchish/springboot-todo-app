package com.jstech.springboot.todoapp.ToDo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<>();
    static {
        todos.add(new ToDo(
                1,
                "aarchish",
                "Learn Spring Boot",
                LocalDate.now().plusMonths(1),
                false
        ));
        todos.add(new ToDo(
                2,
                "aarchish",
                "Learn Full Stack Development",
                LocalDate.now().plusMonths(1),
                false
        ));
        todos.add(new ToDo(
                3,
                "aarchish",
                "Learn React.JS",
                LocalDate.now().plusMonths(1),
                false
        ));
    }

    public List<ToDo> findByUserName(String username){
        return todos;
    }
}
