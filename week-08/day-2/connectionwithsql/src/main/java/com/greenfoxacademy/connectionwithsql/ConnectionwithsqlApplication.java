package com.greenfoxacademy.connectionwithsql;

import com.greenfoxacademy.connectionwithsql.Model.Todo;
import com.greenfoxacademy.connectionwithsql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithsqlApplication implements CommandLineRunner {
  TodoRepository todoRepository;

  @Autowired
  public ConnectionwithsqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithsqlApplication.class, args);
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
