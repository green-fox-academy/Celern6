package carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  int HP;
  int ammostore;
  List<Aircraft> carrier = new ArrayList<>();

  public Carrier(int ammostore){
    this.HP = 5000;
    this.ammostore = ammostore;
  }

  public void addAircraft (){
    int randomnum = (int)(Math.random()*2+1);
    if (randomnum == 1) {
      carrier.add(new F16());
    }
    if (randomnum == 2){
      carrier.add(new F35());
    }
  }

  public void getStatus(){
    int totaldamage = 0;
    for (Aircraft plane : carrier) {
      totaldamage += plane.currentAmmo*plane.baseDamage;
    }
    System.out.println("HP: " + HP + ", Aircraft count: " + carrier.size() + " Ammo storage: "
        + ammostore + " Total damage: " + totaldamage);
    System.out.println("Aircrafts:");
    for (Aircraft plane : carrier) {
      System.out.println(plane.getStatus());
    }
  }

  public void fill(){
    int ammoneed = 0;
    for (Aircraft plane : carrier) {
      ammoneed += plane.maxAmmo - plane.currentAmmo;
    }
    if (ammoneed > ammostore) {
      for ( Aircraft plane : carrier) {
        if (plane.isPriority() == true){
          ammostore = plane.reFill(ammostore);
        }
      }
      for (Aircraft plane : carrier) {
        if (plane.isPriority() == false){
          ammostore = plane.reFill(ammostore);
        }
      }
    }
    else {
      for (Aircraft plane : carrier) {
        ammostore = plane.reFill(ammostore);
      }
    }
  }
  public void fight(Carrier other){
    int damage = 0;
    for (Aircraft plane : carrier) {
      damage += plane.baseDamage*plane.currentAmmo;
      plane.currentAmmo = 0;
    }
    other.HP -= damage;
  }

}
