package com.greenfoxacademy.restapipractice.Model;

import org.springframework.stereotype.Component;

@Component
public class Result {

  private Integer result;


  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
