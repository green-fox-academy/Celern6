package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application {

  TodoRepository todoRepository;

  @Autowired
  public Listingtodosh2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listingtodosh2Application.class, args);
  }
}
