package main.java.animals;

public class Mammal extends Animal {
  public Mammal(String name){
    super(name);
    breedtype = "by pushing out mini versions of itself";
  }
  public String breed() {
    return breedtype;
  }
}
