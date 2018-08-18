package Workshop;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please add the distance in kilometers You would like to convert to miles");
    int userInput1 = scanner.nextInt();
    System.out.println("The distance in miles is: "+(userInput1*0.621371));
  }
}