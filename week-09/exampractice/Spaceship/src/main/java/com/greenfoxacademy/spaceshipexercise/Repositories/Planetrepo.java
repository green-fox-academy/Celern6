package com.greenfoxacademy.spaceshipexercise.Repositories;

import com.greenfoxacademy.spaceshipexercise.Models.Planet;
import org.springframework.data.repository.CrudRepository;

public interface Planetrepo extends CrudRepository<Planet, Long> {
}
