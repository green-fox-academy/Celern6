package com.greenfoxacademy.listingtodosh2.Repository;

import com.greenfoxacademy.listingtodosh2.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {



}
