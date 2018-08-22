package main.java.animals;

public abstract class Animal {
  String name;
  int age;
  String gender;
  String breedtype;

  public Animal(String name) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String breed() {
    return breedtype;
  }
}
