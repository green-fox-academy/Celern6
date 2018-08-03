package Workshop2;

import java.util.Scanner;
public class Drawpiramid {
  Scanner scanner = new Scanner(System.in);
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    Integer num = scanner.nextInt();
    for (int a = num / 2 - 1; a == 0; --a) {
      System.out.print("");}
    for (int b = 1; b <=num; ++b){
      System.out.print("*");}
    for (int c = num / 2 - 1; c == 0; --c) {
      System.out.println("");
    }
  }
}



