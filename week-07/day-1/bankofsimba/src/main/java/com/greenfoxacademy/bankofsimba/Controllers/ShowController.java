package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.Accounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {

  Accounts bankaccounts = new Accounts();

  @GetMapping("/show")
  public String show (Model model){

    model.addAttribute("accountlist", bankaccounts.getAccounts());

    return "show";
  }
}
