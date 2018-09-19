package com.greenfoxacademy.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class GreenColor implements Mycolor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {

    printer.log("Green");
  }
}
