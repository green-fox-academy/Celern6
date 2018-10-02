package com.greenfoxacademy.spaceshipexercise.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spaceship {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int max_capacity;
  private String planet;
  private int utilization;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getMax_capacity() {
    return max_capacity;
  }

  public void setMax_capacity(int max_capacity) {
    this.max_capacity = max_capacity;
  }

  public String getPlanet() {
    return planet;
  }

  public void setPlanet(String planet) {
    this.planet = planet;
  }

  public int getUtilization() {
    return utilization;
  }

  public void setUtilization(int utilization) {
    this.utilization = utilization;
  }
}
