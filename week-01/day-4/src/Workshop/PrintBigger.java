package Workshop;

import java.util.Scanner;

public class PrintBigger {
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
