package com.greenfoxacademy.restapipractice;

import com.greenfoxacademy.restapipractice.Model.Doubling;
import com.greenfoxacademy.restapipractice.Model.Doublingerror;
import com.greenfoxacademy.restapipractice.Model.Greeter;
import com.greenfoxacademy.restapipractice.Model.Greetererror;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  Doubling doubling;
  Doublingerror doublingerror;
  Greeter greeter;
  Greetererror greetererror;

  @Autowired
  public MainService(Doubling doubling, Doublingerror doublingerror, Greeter greeter) {
    this.doubling = doubling;
    this.doublingerror = doublingerror;
    this.greeter = greeter;
  }

  public Object Error() {
    return doublingerror;
  }

  public Object Result(Integer input) {
    doubling.setReceived(input);
    doubling.setResult(input * 2);
    return doubling;
  }

  public Object Greeter(String name, String title) {
    if (name != null && title != null) {
      greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    } else if (name == null && title != null){
      greeter.setWelcome_message("Please provide a name!");
    } else if (name != null && title == null){
      greeter.setWelcome_message("Please provide a title!");
    } else {
      greeter.setWelcome_message("Please provide a name and a title!");
    }
    return greeter;
  }


}
