package Workshop2;
import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
public class DrawTriangle {
  Scanner scanner = new Scanner(System.in);
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    Integer num = scanner.nextInt();
    for (int i = 1; i <= num; ++i) {
      for (int j =1; j <= i; ++j) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }

}
