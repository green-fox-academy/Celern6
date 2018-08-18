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



class PrintBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int userInput1 = scanner.nextInt();
    System.out.println("Please enter another number");
    int userInput2 = scanner.nextInt();
    if (userInput1 > userInput2){
      System.out.println("The bigger number is: "+(userInput1));
    } else if (userInput1 < userInput2){
      System.out.println("The bigger number is: "+(userInput2));
    }else {
      System.out.println("The numbers are the same.");
    }
  }
  }

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

class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of the girls");
    int girls = scanner.nextInt();
    System.out.println("Please enter the number of the boys");
    int boys = scanner.nextInt();
    if ((boys == girls) && ((boys + girls) >= 20)){
      System.out.println("The party is excelent!");
    } else if (((boys + girls) >= 20) && (boys != girls)){
      System.out.println("Quite cool party!");
    }else if (((boys + girls)<20) && (girls > 10)) {
      System.out.println("Average party.");
    }else if (girls < 1){
      System.out.println("Sausage party.");
    }
  }
}

class ConditionalVariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    // if a is even increment out by one
    if (a%2 == 0) {

      out++;

    }

      System.out.println(out);



    int b = 13;
    String out2 = "";
    // if b is between 10 and 20 set out2 to "Sweet!"
    // if less than 10 set out2 to "Less!",
    // if more than 20 set out2 to "More!"
    if (10<b && b<20) {
      out2 = "Sweet!";
    }else if (b<10) {
      out2 = "Less!";
    }else if (b>20) {
      out2 = "More!";
    }

    System.out.println(out2);



    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    // if credits are at least 50,
    // and isBonus is false decrement c by 2
    // if credits are smaller than 50,
    // and isBonus is false decrement c by 1
    // if isBonus is true c should remain the same

    if ((credits >= 50)&&(isBonus == false)){
      c = c-2;
    }
    if ((credits < 50)&& (isBonus)){
      c = c-1;
    }
    if (isBonus == true) {
      c=c;
    }
    System.out.println(c);




    int d = 8;
    int time = 120;
    String out3 = "";
    // if d is dividable by 4
    // and time is not more than 200
    // set out3 to "check"
    // if time is more than 200
    // set out3 to "Time out"
    // otherwise set out3 to "Run Forest Run!"
    if ((d%4 == 0)&&(time <= 200)) {
      out3 = "check";
    }
    if (time > 200){
      out3 = "Time out!";
    } else {
      out3 = "Run Forest Run!";
    }

    System.out.println(out3);
  }
}

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
