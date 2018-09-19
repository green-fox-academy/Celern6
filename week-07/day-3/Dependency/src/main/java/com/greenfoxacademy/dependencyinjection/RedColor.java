package com.greenfoxacademy.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class RedColor implements Mycolor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("red");
  }
}
