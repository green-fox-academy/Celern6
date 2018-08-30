package gardeningapp;

public class Flower extends Plant {

  public Flower(String color) {

    super(color);
    this.name = "Flower";
    this.waterneed = 5;
    this.absorb = 0.75;

  }

  @Override
  public void grow() {
    System.out.println(color + " " + name + " Grew some petals");
  }
}
