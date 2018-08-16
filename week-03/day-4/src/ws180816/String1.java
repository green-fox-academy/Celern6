package ws180816;

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
  public static void main(String[] args) {
    String word = "xerox";
    System.out.println(betucsere(word));
  }

  public static String betucsere(String szo) {
    int i = 0;
    if (szo.charAt(i) == 'x') {
      szo.replace('x', 'y');
  //    return (String) betucsere((i+1));
    }
    return szo;
  }
}