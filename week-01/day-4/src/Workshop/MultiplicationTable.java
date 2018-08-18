package Workshop;

import java.util.Scanner;

class MultiplicationTable  {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    for (int i = 1; i < 11; i++) {
      System.out.println(number*i);
    }
  }
}