package com.greenfoxacademy.listingtodosh2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {



  Repository repository;

  @Autowired
  public TodoController(Repository repository) {
    this.repository = repository;
  }


  @GetMapping("/todo")
  public String todoController (){
    return "todo";
  }

  @GetMapping(value = {"/", "/list"})
  @ResponseBody
  public String list(Model model){
    return "This is my first todo";
  }

}
