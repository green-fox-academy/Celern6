package ws180816;

public class NumberAdder {
  public static void main(String[] args) {
      int n = 12;
      countdown(n);
  }
  public static int countdown (int number){
    if (number >= countdown(number-number+1)){
      countdown(number-number+1);
      System.out.println(countdown(number));
    }
    return number;
  }
}

