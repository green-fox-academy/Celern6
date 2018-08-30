package gardeningapp;

public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("Blue"));
    garden.addPlant(new Flower("Yellow"));
    garden.addPlant(new Tree("Orange"));
    garden.addPlant(new Tree("Purple"));
    garden.watering(40);
    garden.gardernStatus();
    garden.watering(70);
    garden.gardernStatus();
    garden.gardenGrow();
  }

}
