package main.java.animals;

public class Reptile extends Animal {
  public Reptile(String name){
    super(name, breedtype);
  }
  public String breed() {
    return breedtype;
  }
}
