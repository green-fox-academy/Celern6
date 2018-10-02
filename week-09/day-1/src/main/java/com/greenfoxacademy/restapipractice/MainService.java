package com.greenfoxacademy.restapipractice;

import com.greenfoxacademy.restapipractice.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  Doubling doubling;
  Doublingerror doublingerror;
  Greeter greeter;
  Append append;
  Dountil dountil;
  Result result;

  @Autowired
  public MainService(Doubling doubling, Doublingerror doublingerror, Greeter greeter, Append append, Dountil dountil, Result result) {
    this.doubling = doubling;
    this.doublingerror = doublingerror;
    this.greeter = greeter;
    this.append = append;
    this.dountil = dountil;
    this.result = result;
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
    } else if (name == null && title != null) {
      greeter.setWelcome_message("Please provide a name!");
    } else if (name != null && title == null) {
      greeter.setWelcome_message("Please provide a title!");
    } else {
      greeter.setWelcome_message("Please provide a name and a title!");
    }
    return greeter;
  }

  public Object AppendA(String input) {
    append.setAppended(input + "a");
    return append;
  }

  public Object sumuntil(Integer until) {
    int tempnumber = 0;
    while (until > 0) {
      tempnumber += (until + (until - 1));
      until -= 2;
    }
    result.setResult(tempnumber);
    return result;
  }

  public Object factoruntil(Integer until) {
    int tempfactor;
    int tempnum;
    for (int i = until; i > 0 ; i--) {
      tempnum = i;

    }

    return null;
  }


}
