package gforg;

public class Student extends Person {
  public String previousOrganization;
  public int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior software developer!");
  }
  public void introduce(){
    System.out.println("Hi, i'm" + name + "a" + age + "year old" + gender + "from" + previousOrganization + "who skipped" + skippedDays + "days from the course already.");
  }
  public void skipDays(int numberofDays){
    skippedDays += numberofDays;
  }

  public Student(String name, int age, String gender, String previousOrganization){
    skippedDays = 0;
  }

  Student (){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
}
