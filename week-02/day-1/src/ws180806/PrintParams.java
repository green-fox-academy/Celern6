package ws180806;

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

public class PrintParams {
  public static void main(String[] args){
    printParams("elso", "masodik", "harmadik");
  }
  public static void printParams (String... allElements){
    for (String element : allElements) {
      System.out.println(element);
    }
  }
}
