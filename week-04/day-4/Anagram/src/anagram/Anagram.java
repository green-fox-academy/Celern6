package anagram;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
	// write your code here\
      String elso = "Masac";
      String masodik = "lamac";
      System.out.println(anagrammer(elso, masodik));
    }

    public static boolean anagrammer(String elso, String masodik) {
      char[] s1Array = elso.toLowerCase().toCharArray();
      char[] s2Array = masodik.toLowerCase().toCharArray();
      Arrays.sort(s1Array);
      Arrays.sort(s2Array);
      boolean status;
      status = Arrays.equals(s1Array, s2Array);
      return status;
    }
}
