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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getFood() {
    return food;
  }

  public void setFood(int food) {
    this.food = food;
  }

  public int getDrink() {
    return drink;
  }

  public void setDrink(int drink) {
    this.drink = drink;
  }
}
