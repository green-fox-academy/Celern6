package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  long id;
  String content;

  public Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }
}
