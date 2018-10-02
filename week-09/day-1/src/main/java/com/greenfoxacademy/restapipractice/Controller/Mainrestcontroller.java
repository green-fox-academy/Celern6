package com.greenfoxacademy.restapipractice.Controller;

import com.greenfoxacademy.restapipractice.MainService;
import com.greenfoxacademy.restapipractice.Model.Dountil;
import com.greenfoxacademy.restapipractice.Model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Mainrestcontroller {

  MainService mainService;

  @Autowired
  public Mainrestcontroller(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/doubling")
  public Object doubler(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return mainService.Error();
    } else {
      return mainService.Result(input);
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    return mainService.Greeter(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appender(@PathVariable("appendable") String appendable) {
    return mainService.AppendA(appendable);
  }

  @PostMapping("/dountil/{action}")
  public Object dountil(@PathVariable("action") String action,
                        @RequestBody Dountil dountil) {
    if (action.equals("sum")) {
      return mainService.sumuntil(dountil.getUntil());
    } else if (action.equals("factor")){
      return mainService.factoruntil(dountil.getUntil());
    }
    return null;
  }

}
