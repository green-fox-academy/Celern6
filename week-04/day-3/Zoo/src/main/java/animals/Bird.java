package main.java.animals;

public class Bird extends Animal {
  public Bird (String name) {
    super(name);
    breedtype = "by egg";
  }
  public String breed() {
    return breedtype;
  }
}
