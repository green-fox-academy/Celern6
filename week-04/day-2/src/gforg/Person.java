package gforg;

public class Person {
  public String name;
  public int age;
  public String gender;

  public void introduce (){
    System.out.println("Hi, i'm" + name + "a" + age + "year old" + gender);
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment.");
  }
  public Person (String name,int age,String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
