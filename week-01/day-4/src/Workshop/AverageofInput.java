package Workshop;

import java.util.Scanner;

public class AverageofInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the first number");
    int userInput1 = scanner.nextInt();
    System.out.println("Please enter the second number");
    int userInput2 = scanner.nextInt();
    System.out.println("Please enter the third number");
    int userInput3 = scanner.nextInt();
    System.out.println("Please enter the fourth number");
    int userInput4 = scanner.nextInt();
    System.out.println("Please enter the fifth number");
    int userInput5 = scanner.nextInt();
    System.out.println("Sum: "+(userInput1+userInput2+userInput3+userInput4+userInput5)+" Average: "+((userInput1+userInput2+userInput3+userInput4+userInput5)/5));

  }
}