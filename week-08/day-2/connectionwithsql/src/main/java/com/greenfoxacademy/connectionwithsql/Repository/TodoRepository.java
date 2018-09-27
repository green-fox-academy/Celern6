package com.greenfoxacademy.connectionwithsql.Repository;

import com.greenfoxacademy.connectionwithsql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
  List<Todo> findAllByDoneIsFalse();
  List<Todo> findAllByDoneIsTrue();
  List<Todo> findByTitleContaining(String input);


  @Override
  Optional<Todo> findById(Long aLong);
}
