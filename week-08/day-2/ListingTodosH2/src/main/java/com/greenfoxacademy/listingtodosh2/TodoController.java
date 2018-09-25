package com.greenfoxacademy.listingtodosh2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {


  @GetMapping("/todo")
  public String todoController (){
    return "todo";
  }

  @GetMapping("/list")
  public String list(Model model){
    return "This is my first todo";
  }

}
