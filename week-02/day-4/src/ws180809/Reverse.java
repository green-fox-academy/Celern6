package ws180809;

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    int aj [] = {3, 4, 5, 6, 7};
    int [] raj = new int[aj.length];
    int k = 0;
    for (int i = aj.length-1; i >= 0; i--) {
      raj[k] = aj[i];
      k = k+1;
    }
    System.out.println(Arrays.toString(raj));
  }
}
