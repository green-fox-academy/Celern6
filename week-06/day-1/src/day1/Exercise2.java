package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Exercise2 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(averager(numbers));

  }

  public static OptionalDouble averager (ArrayList<Integer> list){
    return list.stream()
                  .filter(x -> x%2 != 0)
                  .mapToInt(x -> x)
                  .average();
  }

}
