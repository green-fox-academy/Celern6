package cloneable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
      Student Jani = new Student("Jani", 20, "male", "BME");
      Jani.introduce();
      Jani.clone().introduce();
    }
}
