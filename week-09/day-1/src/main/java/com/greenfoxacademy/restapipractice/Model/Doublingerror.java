package com.greenfoxacademy.restapipractice.Model;

import org.springframework.stereotype.Component;

@Component
public class Doublingerror {


  private String error = "Please provide an input!";


  public Doublingerror(String error) {
    this.error = error;
  }

  public Doublingerror(){}

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
