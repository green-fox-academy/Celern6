package day1;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    String word = "KeEpFlOyDiNg";
    String uppercases = word
                        .chars()
                        .filter(Character :: isUpperCase)
                        .mapToObj(x -> Character.toString((char) x))
                        .collect(Collectors.joining());
    System.out.println(uppercases);
  }

}
