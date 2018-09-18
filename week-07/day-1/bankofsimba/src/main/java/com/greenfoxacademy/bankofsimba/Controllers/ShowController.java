package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShowController {


  @GetMapping("/show")
  public String show (Model model){
    BankAccount simba = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("name", simba.getName());
    model.addAttribute("balance", simba.getBalance());
    model.addAttribute("animalType", simba.getAnimalType());

    return "show";
  }
}
