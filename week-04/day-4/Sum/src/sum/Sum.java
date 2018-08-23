package sum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {
	// write your code here
      int [] lista = {1, 2, 3, 4};
      System.out.println(sumApp(lista));
    }
    public static int sumApp(int [] lista){
      int osszeg = 0;
      for (int i = 0; i < lista.length; i++) {
      osszeg += lista [i];
      }
      return osszeg;
    }
}
