package com.greenfoxacademy.bankofsimba.Controllers;


import com.greenfoxacademy.bankofsimba.Models.BankAccount;
import com.greenfoxacademy.bankofsimba.Services.Mainservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  Mainservices mainservices;

  @Autowired
  public MainController(Mainservices mainservices) {
    this.mainservices = mainservices;
  }

  @GetMapping("/show")
  public String showAccounts(Model model){
    model.addAttribute("accounts", mainservices.getAllAccounts());
    return "index";
  }

  @PostMapping("/show")
  public String createAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "balance") long balance,
                              @RequestParam(value = "animaltype") String animaltype){
    mainservices.createAccount(new BankAccount(name, balance, animaltype));
    return "redirect:/show";
  }
}
