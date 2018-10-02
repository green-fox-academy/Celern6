package com.greenfoxacademy.spaceshipexercise.Repositories;

import com.greenfoxacademy.spaceshipexercise.Models.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Planetrepository extends CrudRepository<Planet, Long> {

  List<Planet> findAll();

}
