package com.jstech.springboot.todoapp.ToDo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("username")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {

        this.toDoService = toDoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){

        List<ToDo> todos = toDoService.findByUserName("aarchish");
        model.addAttribute("todos",todos);

        return "listTodos";
    }
}
