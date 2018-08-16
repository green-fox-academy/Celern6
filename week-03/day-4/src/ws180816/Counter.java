package ws180816;

public class Counter {

  // Write a recursive function that takes one parameter: n and counts down from n.

  public static void main(String[] args) {
    int n = 12;
    countdown(n);
  }
  public static int countdown (int number){
    if (number > 0){
      System.out.println(number);
      countdown(number-1);
    }
    return number;
  }
}
