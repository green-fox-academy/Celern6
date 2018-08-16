package ws180816;

public class NumberAdder {
  public static void main(String[] args) {
      int n = 12;
      numberAdder(n);
  }
  public static int numberAdder (int number){
    int i = 0;
    if (number >= i){
      System.out.println(numberAdder(number));
      i += 1;
    }
    return number;
  }
}

