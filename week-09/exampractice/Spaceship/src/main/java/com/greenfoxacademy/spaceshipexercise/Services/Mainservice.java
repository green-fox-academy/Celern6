package com.greenfoxacademy.spaceshipexercise.Services;

import com.greenfoxacademy.spaceshipexercise.Models.Planet;
import com.greenfoxacademy.spaceshipexercise.Models.Spaceship;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Mainservice {

  List<Planet> getPlanets();
  Spaceship getShip(long id);

}
