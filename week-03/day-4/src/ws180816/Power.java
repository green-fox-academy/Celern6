package ws180816;

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
  public static void main(String[] args) {
    int base = 3;
    int power = 5;
    System.out.println(powerer(base, power));
  }
  public static Integer powerer(int b, int p){
    if (p == 1) {
      return b;
    } else {
      return powerer(b * b, p - 1);
    }
  }
}
