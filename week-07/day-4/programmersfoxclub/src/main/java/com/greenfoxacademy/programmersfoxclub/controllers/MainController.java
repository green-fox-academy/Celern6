package com.greenfoxacademy.programmersfoxclub.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


  @GetMapping("/login")
  public String login (Model model){
    return "login";
  }

  @PostMapping()
  public void xy (@RequestParam("name")){

  }
}
