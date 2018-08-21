package gforg;

public class Sponsor extends Person {
  public String company;
  public int hiredStudents;

  public void introduce(){
    System.out.println("Hi, i'm "+ name + " a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + "students so far.");
  }
  public void hire(){
    hiredStudents += 1;
  }

  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }
  public Sponsor (String name, int age, String gender, String company){
  hiredStudents = 0;
  }
  public  Sponsor (){
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }
}
