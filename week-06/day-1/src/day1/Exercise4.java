package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(squaredislargerthan20(numbers));
  }

  public static List<Integer> squaredislargerthan20 (ArrayList<Integer> list){
    return list.stream()
               .map(x -> x*x)
               .filter(x -> x > 20)
               .collect(Collectors.toList());
  }
}
