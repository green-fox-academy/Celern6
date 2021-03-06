package com.greenfoxacademy.listingtodosh2.Controller;


import com.greenfoxacademy.listingtodosh2.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {



  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  @GetMapping("/todo")
  public String todoController (){
    return "todo";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

}
