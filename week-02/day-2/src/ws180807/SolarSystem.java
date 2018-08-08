package ws180807;

import java.util.*;

import static com.sun.javafx.fxml.expression.Expression.add;

public class SolarSystem{
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.

    System.out.println(putSaturn(planetList));
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
  }
  public static ArrayList<String> putSaturn(ArrayList<String> example){
    ArrayList<String> list2 = new ArrayList<>();
    list2.addAll(example);
    list2.add("Saturn");
    return list2;
  }
}
