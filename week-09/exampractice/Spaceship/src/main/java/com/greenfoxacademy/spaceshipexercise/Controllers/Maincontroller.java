package com.greenfoxacademy.spaceshipexercise.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Maincontroller {


  @GetMapping("/")
  public String mainpage(){
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String movehere(@PathVariable ("id") String id){
    return null;
  }

  @GetMapping("/toship/{id}")
  public String toship(@PathVariable ("id") String id){
    return null;
  }

  @GetMapping("/toplanet/{id}")
  public String toplanet(@PathVariable ("id") String id){
    return null;
  }


}
