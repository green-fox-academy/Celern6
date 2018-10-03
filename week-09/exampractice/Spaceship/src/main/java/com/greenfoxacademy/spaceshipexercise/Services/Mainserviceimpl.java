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

  @Override
  public void shipMover(long id) {
    Planet planet = planetrepository.findById(id);
    Spaceship spaceship = spaceshiprepository.findById(1);

    spaceship.setPlanet(planet.getName());
    spaceshiprepository.save(spaceship);
  }

  @Override
  public void pplToShip(long id) {
    Planet planet = planetrepository.findById(id);
    Spaceship spaceship = spaceshiprepository.findById(1);

    int freeshipcap = spaceship.getMax_capacity()- (int)spaceship.getUtilization();

    if(freeshipcap > planet.getPopulation()) {
      spaceship.setUtilization(spaceship.getUtilization()+planet.getPopulation());
      planet.setPopulation(0);
    } else if (freeshipcap < planet.getPopulation() && freeshipcap > 0) {
      spaceship.setUtilization(spaceship.getUtilization()+freeshipcap);
      planet.setPopulation(planet.getPopulation()-freeshipcap);
    }
    planetrepository.save(planet);
    spaceshiprepository.save(spaceship);
  }

  @Override
  public void pplToPlanet(long id) {
    Planet planet = planetrepository.findById(id);
    Spaceship spaceship = spaceshiprepository.findById(1);

    planet.setPopulation(planet.getPopulation()+spaceship.getUtilization());
    spaceship.setUtilization(0);

    planetrepository.save(planet);
    spaceshiprepository.save(spaceship);

  }


}
