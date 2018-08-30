package gardeningapp;

public class Tree extends Plant {
  public Tree(String color) {

    super(color);
    this.name = "Tree";
    this.waterneed = 5;
    this.absorb = 0.4;
  }

  @Override
  public void grow() {
    System.out.println(color + " " + name + " Grew some branch.");
  }
}
