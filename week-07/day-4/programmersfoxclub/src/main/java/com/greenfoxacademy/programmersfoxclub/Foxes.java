package com.greenfoxacademy.programmersfoxclub;


import java.util.ArrayList;
import java.util.List;


public class Foxes {

  List<Fox> foxlist;

  public Foxes() {
    foxlist = new ArrayList<>();
    foxlist.add( new Fox("Vuk", "babybunnies", "beer"));
  }

  public void addFox(String name, String food, String drink){
    foxlist.add(new Fox(name, food, drink));
  }

  public Fox getFox (String name){
    List<Fox> foxes = new ArrayList<>();
    for (int i = 0; i < foxlist.size(); i++) {
      if (foxlist.get(i).getName().equals(name)){
        foxes.add(foxlist.get(i));
      }
    }
    return foxes.get(0);
  }
}
