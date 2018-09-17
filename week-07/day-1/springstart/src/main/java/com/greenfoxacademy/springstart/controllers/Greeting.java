package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  public AtomicLong getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  static AtomicLong id = new AtomicLong(1);
  String content;

  public Greeting (String content){
    id.getAndIncrement();
    this.content = content;
  }
}
