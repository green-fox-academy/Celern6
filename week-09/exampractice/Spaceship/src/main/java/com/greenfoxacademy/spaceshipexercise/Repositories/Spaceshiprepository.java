package com.greenfoxacademy.spaceshipexercise.Repositories;

import com.greenfoxacademy.spaceshipexercise.Models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spaceshiprepository extends CrudRepository<Spaceship, Long> {

  Spaceship findById(long id);
}
