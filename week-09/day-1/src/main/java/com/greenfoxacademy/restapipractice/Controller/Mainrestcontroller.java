package com.greenfoxacademy.restapipractice.Controller;

import com.greenfoxacademy.restapipractice.MainService;
import com.greenfoxacademy.restapipractice.Model.Doubling;
import com.greenfoxacademy.restapipractice.Model.Doublingerror;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mainrestcontroller {

  MainService mainService;

  @Autowired
  public Mainrestcontroller(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/doubling")
  public Object doubler(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null){
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
}
