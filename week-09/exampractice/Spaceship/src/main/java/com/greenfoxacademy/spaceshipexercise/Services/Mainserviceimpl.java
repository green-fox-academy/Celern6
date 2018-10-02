package com.greenfoxacademy.spaceshipexercise.Services;

import com.greenfoxacademy.spaceshipexercise.Models.Planet;
import com.greenfoxacademy.spaceshipexercise.Models.Spaceship;
import com.greenfoxacademy.spaceshipexercise.Repositories.Planetrepository;
import com.greenfoxacademy.spaceshipexercise.Repositories.Spaceshiprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mainserviceimpl implements Mainservice {

  Planetrepository planetrepository;
  Spaceshiprepository spaceshiprepository;

  @Autowired
  public Mainserviceimpl(Planetrepository planetrepository, Spaceshiprepository spaceshiprepository) {
    this.planetrepository = planetrepository;
    this.spaceshiprepository = spaceshiprepository;
  }

  @Override
  public List<Planet> getPlanets() {
    return planetrepository.findAll();
  }

  @Override
  public Spaceship getShip(long id) {
    return spaceshiprepository.findById(id);
  }
}