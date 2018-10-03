package com.greenfoxacademy.spaceshipexercise.Controllers;

import com.greenfoxacademy.spaceshipexercise.Services.Mainservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Maincontroller {

  Mainservice mainservice;

  @Autowired
  public Maincontroller(Mainservice mainservice){
    this.mainservice = mainservice;
  }


  @GetMapping("/")
  public String mainpage(Model model){
    model.addAttribute("planets", mainservice.getPlanets());
    model.addAttribute("ship", mainservice.getShip(1));
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String movehere(@PathVariable ("id") long id){
    mainservice.shipMover(id);
    return "redirect:/";
  }

  @GetMapping("/toship/{id}")
  public String toship(@PathVariable ("id") long id){
    mainservice.pplToShip(id);
    return "redirect:/";
  }

  @GetMapping("/toplanet/{id}")
  public String toplanet(@PathVariable ("id") long id){
    mainservice.pplToPlanet(id);
    return null;
  }


}
