package com.greenfoxacademy.programmersfoxclub;


import java.util.ArrayList;
import java.util.List;


public class Foxes {

  List<Fox> foxlist;

  public Foxes() {
    foxlist = new ArrayList<>();
  }

  public void addFox(String name, String food, String drink){
    foxlist.add(new Fox(name, food, drink));
  }

  public Fox getFox(String name){
    for (Fox oneElement : foxlist) {
      if (oneElement.getName() == name){
        return oneElement;
      }
    }
    return null;
  }
}
