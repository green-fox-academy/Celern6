package ws180814;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines{
  public static void main(String[] args) {
    try {
     Path filepath = Paths.get("valami.txt");
     List<String> lines = Files.readAllLines(filepath);
     int counter = 1;
     for (String i : lines)
     {
       counter += 1;}
     } catch (Exception e){
     System.out.println("0");
     }

  }
}