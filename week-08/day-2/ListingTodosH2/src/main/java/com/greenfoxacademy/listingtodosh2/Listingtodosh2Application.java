package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.Model.Todo;
import com.greenfoxacademy.listingtodosh2.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public Listingtodosh2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listingtodosh2Application.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Walk the dog"));
    todoRepository.save(new Todo("Take a dump"));
    todoRepository.save(new Todo("Play the guitar"));
    todoRepository.save(new Todo("Beat Adam!!! "));
    System.out.println("szia");
  }
}
