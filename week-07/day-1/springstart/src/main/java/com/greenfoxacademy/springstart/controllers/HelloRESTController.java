package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong(1);
  @RequestMapping(value="/greeting")
    public Greeting greetings (@RequestParam("name") String content){
      return new Greeting (counter.getAndIncrement(), "Hello, " + content);
    }
}
