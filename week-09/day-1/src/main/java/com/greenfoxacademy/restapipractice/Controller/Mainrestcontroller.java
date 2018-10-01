package com.greenfoxacademy.restapipractice.Controller;

import com.greenfoxacademy.restapipractice.MainService;
import com.greenfoxacademy.restapipractice.Model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mainrestcontroller {

  MainService mainService;


  @GetMapping("/doubling")
  public Integer doubler (@RequestParam(value = "input", required = false) Integer input){
    return new Doubling(input).getResult();
  }

}
