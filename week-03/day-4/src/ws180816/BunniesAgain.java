package ws180816;

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


public class BunniesAgain {
  public static void main(String[] args) {
    int bunnies = 5;
    System.out.println(furanyuszik(bunnies));
  }
  public static Integer furanyuszik (int nyuszik){
    int ketfulu = 2;
    int haromfulu = 3;
    if (nyuszik == 1){
      return ketfulu;
    } else if (nyuszik % 2 == 0){
      return haromfulu + furanyuszik(nyuszik-1);
    } else {
      return ketfulu + furanyuszik(nyuszik-1);
    }
  }
}
