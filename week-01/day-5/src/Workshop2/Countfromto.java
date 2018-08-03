package Workshop2;
import java.util.Scanner;
public class Countfromto {

  // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    Integer number1 = scanner.nextInt();
    System.out.println("Please enter another number");
    Integer number2 = scanner.nextInt();
      while (number2 <= number1) {
        System.out.println("The second number should be bigger! Please enter another");
        number2 = scanner.nextInt();
      }
        while (number1 < number2) {
          System.out.println(number1);
          number1++;
    }

    }
}
