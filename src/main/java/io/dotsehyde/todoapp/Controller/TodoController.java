package io.dotsehyde.todoapp.Controller;

import io.dotsehyde.todoapp.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    private final TodoService todoService;
    @Autowired
    public TodoController( TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping("/list")
    public String getAllTodos(ModelMap model) {
        var todos = todoService.getAll();
        model.addAttribute("todo",todos);
        return "index";
    }
}
