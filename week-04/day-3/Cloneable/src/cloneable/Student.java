package cloneable;

class Student extends Person implements Clone{
  String previousOrganization;
  int skippedDays;



  public void getGoal() {
    System.out.println("Be a junior software developer!");
  }
  public void introduce(){
    System.out.println("Hi, i'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }
  public void skipDays(int numberofDays){
    this.skippedDays += numberofDays;
  }

  public Student(String name, int age, String gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student (){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student clone (){
    Student x = new Student(name, age, gender, previousOrganization);
    return x;
  }
}