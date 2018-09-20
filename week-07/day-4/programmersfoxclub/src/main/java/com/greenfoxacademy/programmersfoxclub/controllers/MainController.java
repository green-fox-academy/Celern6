package com.greenfoxacademy.programmersfoxclub.controllers;


import com.greenfoxacademy.programmersfoxclub.Foxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Foxes foxes;

  @GetMapping("/")
  public String main (@RequestParam(value = "name", required = false) String name, Model model){
    if (name != null){
    model.addAttribute("name", name);

    return "index";
    } else {
      return "redirect:/login";
    }
  }


  @GetMapping("/login")
  public String login (Model model){
    return "login";
  }

  @PostMapping("/login")
  public String namepost (@RequestParam("name") String name){
    return "redirect:/?name="+name;
  }
}
