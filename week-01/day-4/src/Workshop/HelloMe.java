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




// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4


// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot




// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people




class IWontcheatontheexams {
  public static void main(String[] args) {
    int a = 0;
    while (a < 100) {
      System.out.println("I wont cheat in the exam.");
      a += 1;
    }
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
