package Workshop;
import java.util.Scanner;
class HelloMe {
  public static void main(String[] args) {
    // Modify this program to greet you instead of the World!
    System.out.println("Hello, András!");
  }
}






// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

// Did You mean edges?



class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Whats Your name?");
    String userInput1 = scanner.nextLine();
    System.out.println("Hello "+userInput1+"!");
  }
}



class Printeven {
  public static void main(String[] args) {
    int a = 0;
    while (a < 501) {
      System.out.println(a);
      a += 2;
    }
  }
}

class Multiplication table  {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 1;  < 11) {
      System.out.println(number*a);
      a += 1;
    }
  }
}
