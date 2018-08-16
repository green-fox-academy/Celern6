package ws180816;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
  public static void main(String[] args) {
    int bunnies = 10;
    System.out.println(bunnycounter(bunnies));
  }
  public static Integer bunnycounter(int nyuszik){
    int fulek = 2;
    if (nyuszik == 1) {
      return fulek;
    } else {
      return fulek + bunnycounter(nyuszik-1);
    }
  }
}

