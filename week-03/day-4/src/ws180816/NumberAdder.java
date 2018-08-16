package ws180816;

public class NumberAdder {
  public static void main(String[] args) {
      int n = 5;
    System.out.println(numberAdder(n));
  }
  public static int numberAdder (int number){
    if (number > 1){
      return number + numberAdder(number-1);
    }
    return number;
  }
}

