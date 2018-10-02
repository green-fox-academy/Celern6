package com.greenfoxacademy.iamgroot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object guardiancontroller (@RequestParam (value = "message") String somemessage){

  }


}
