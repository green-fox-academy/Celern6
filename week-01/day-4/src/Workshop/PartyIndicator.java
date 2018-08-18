package Workshop;

import java.util.Scanner;

public class PartyIndicator {
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
