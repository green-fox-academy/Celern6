package cloneable;

public class Person {
  String name;
  int age;
  String gender;

  public void introduce (){
    System.out.println("Hi, i'm " + name + " a " + age + " year old " + gender);
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment.");
  }
  public Person (String name,int age,String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  Person(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
}