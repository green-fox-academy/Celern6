package gardeningapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plants = new ArrayList<>();

  public void addPlant (Plant plant){
    plants.add(plant);
  }

  public void watering (double amount){
    if (plants.size() == 0){
      System.out.println("The plants doesnt need any watering");
    } else {
      double waterunit = amount/plants.size();
      for ( Plant plant : plants) {
        plant.watering(waterunit);
      }
    }
  }
  public void gardernStatus (){
    for (Plant plant : plants) {
      plant.getstatus();
    }
  }
  public void gardenGrow (){
    for (Plant plant : plants) {
      plant.grow();
    }
  }
}
