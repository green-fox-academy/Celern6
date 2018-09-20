package com.greenfoxacademy.programmersfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;

  private List<String> tricks;

  public Fox(String name, String food, String drink){
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

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
