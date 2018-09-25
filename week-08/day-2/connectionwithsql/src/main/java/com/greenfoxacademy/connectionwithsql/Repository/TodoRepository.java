package com.greenfoxacademy.connectionwithsql.Repository;

import com.greenfoxacademy.connectionwithsql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
  List<Todo> findAllByDoneIsFalse();
  List<Todo> findAllByDoneIsTrue();
  Todo findById();


}
