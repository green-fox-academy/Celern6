package com.greenfoxacademy.restapipractice.Model;

import org.springframework.stereotype.Component;

@Component
public class Dountil {

  private Integer until;

  public Dountil() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}


