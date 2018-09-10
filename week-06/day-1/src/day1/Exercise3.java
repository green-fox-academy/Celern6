package day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise3 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(squarer(numbers));
  }

  public static List<Integer> squarer(ArrayList<Integer> list){
    return list.stream()
        .filter(x -> x > 0)
        .map(x -> x * x)
        .collect(Collectors.toList());
  }
}
