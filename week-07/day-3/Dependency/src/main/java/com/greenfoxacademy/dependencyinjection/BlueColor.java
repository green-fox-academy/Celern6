package com.greenfoxacademy.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements Mycolor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("Blue");
  }
}
