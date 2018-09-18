package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.Accounts;
import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShowController {


  @GetMapping("/show")
  public String show (Model model){
    Accounts bankaccounts = new Accounts();
    bankaccounts.addAccount(new BankAccount("Simba", 2000, "Lion"));

    model.addAttribute("name", bankaccounts.getAccount("Simba").getName());
    model.addAttribute("balance", bankaccounts.getAccount("Simba").getBalance());
    model.addAttribute("animalType", bankaccounts.getAccount("Simba").getAnimalType());

    return "show";
  }
}
