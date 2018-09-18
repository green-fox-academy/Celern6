package com.greenfoxacademy.bankofsimba.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLception {

  @GetMapping("/htmlception")
  public String htmlCeption (Model model){
      model.addAttribute("String", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }
}
