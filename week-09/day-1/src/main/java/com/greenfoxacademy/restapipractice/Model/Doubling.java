package com.greenfoxacademy.restapipractice.Model;


public class Doubling {

  private Integer recieved;
  private Integer result;

  public Doubling(Integer recieved){
    this.recieved = recieved;
    this.result = recieved*2;
  }

  public Doubling(){

  }

  public Integer getRecieved() {
    return recieved;
  }

  public void setRecieved(Integer recieved) {
    this.recieved = recieved;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


}
