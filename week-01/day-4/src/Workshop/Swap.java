package Workshop;

public class Swap {
  public static void main(String[] args) {
    // Swap the values of the variables
    int a = 123;
    int b = 526;

    a = a+b;
    b = a-b;
    a = (b-a)*-1;

    System.out.println(a);
    System.out.println(b);
  }
}