package com.greenfoxacademy.connectionwithsql.Repository;

import com.greenfoxacademy.connectionwithsql.Model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
  List<Assignee> findAll();
}
