package ws180816;

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {
  public static void main(String[] args) {
    int x = 1345134;
    System.out.println(digitsummer(x));
  }

  public static int digitsummer(int number) {
    if (number == 0) {
      return 0;
    } else {
      return (number % 10 + digitsummer(number / 10));
    }

  }
}
