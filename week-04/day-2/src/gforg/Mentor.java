package gforg;

public class Mentor extends Person{
  String level;

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, i'm " + name + " a " + age + " year old " + gender + " " + level + " mentor.");
  }
  public Mentor (String name, int age, String gender, String level){
  }
  Mentor (){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "Intermediate";
  }
}
