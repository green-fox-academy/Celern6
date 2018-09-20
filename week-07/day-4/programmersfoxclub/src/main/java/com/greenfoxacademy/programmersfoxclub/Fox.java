package com.greenfoxacademy.programmersfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private int food;
  private int drink;

  List<String> tricks;

  public Fox(String name, int food, int drink){
    this.name = name;
    this.food = food;
    this.drink = drink;
    tricks = new ArrayList<>();
  }

}
