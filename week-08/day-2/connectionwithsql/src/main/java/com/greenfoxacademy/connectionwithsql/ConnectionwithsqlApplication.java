package com.greenfoxacademy.connectionwithsql;

import com.greenfoxacademy.connectionwithsql.Model.Assignee;
import com.greenfoxacademy.connectionwithsql.Model.Todo;
import com.greenfoxacademy.connectionwithsql.Repository.AssigneeRepo;
import com.greenfoxacademy.connectionwithsql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithsqlApplication implements CommandLineRunner {

  TodoRepository todoRepository;
  AssigneeRepo assigneeRepo;

  @Autowired
  public ConnectionwithsqlApplication(TodoRepository todoRepository, AssigneeRepo assigneeRepo) {
    this.todoRepository = todoRepository;
    this.assigneeRepo = assigneeRepo;
  }


  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithsqlApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Walk the dog", true, false));
    todoRepository.save(new Todo("Take a dump", false, true));
    todoRepository.save(new Todo("Play the guitar", true, false));
    todoRepository.save(new Todo("Beat Adam!!! ", true, true));
    assigneeRepo.save(new Assignee("Andris", "andris@greenfox.hu"));
  }
}
