package Workshop;

import java.util.Scanner;

public class Onetwoalot {
  // how about odd numbers?
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int userInput1 = scanner.nextInt();
    if (userInput1 <= 0){
      System.out.println("Not enough");
    } else if (userInput1 == 1){
      System.out.println("One");
    }else if (userInput1 == 2){
      System.out.println("Two");
    }else if (userInput1 > 2){
      System.out.println("A lot");
    }
  }
}