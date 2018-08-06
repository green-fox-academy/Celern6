package ws180806;
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
  public static void main(String[] args){
    int num1 = 8;
    System.out.println(factorio(num1));
  }
  public static int factorio(int number) {
    int b = 1;
    for (int a = 1; a <= number; a++) {
      b *= a;
    }
    return b;
  }
}