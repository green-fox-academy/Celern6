package com.greenfoxacademy.listingtodosh2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {


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
