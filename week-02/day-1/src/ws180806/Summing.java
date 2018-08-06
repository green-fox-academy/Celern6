package ws180806;

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Summing {
  public static void main(String[] args){
    int num1 = 8;
    System.out.println(sum(num1));
  }
  public static int sum(int number) {
    int b = 0;
    for (int a = 1; a <= number; a++) {
      b += a;
    }
    return b;
  }
}
