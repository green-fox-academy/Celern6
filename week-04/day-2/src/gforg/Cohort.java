package gforg;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> Students;
  ArrayList<Mentor> Mentors;

  public void addStudent(Student student){
    Students.add(student);
  }
  public void addMentor (Mentor mentor){
    Mentors.add(mentor);
  }
  public void info (){
    System.out.println("The " + name + " has " + Students.size() + " students " + " and " + Mentors.size() + " mentors.");
  }
  public Cohort(){
    Students = new ArrayList<>();
    Mentors = new ArrayList<>();
  }
}
