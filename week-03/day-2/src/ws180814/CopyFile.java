package ws180814;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    String filename1 = "my-file.txt";
    String filename2 = "my-other-file.txt";
    System.out.println(copyguru(filename1, filename2));
  }
  public static boolean copyguru(String f1, String f2){
    Path filepath1 = Paths.get(f1);
    Path filepath2 = Paths.get(f2);
    try {
      Files.copy(filepath1, filepath2);
      return true;
    } catch (Exception e){
      return false;
    }
  }
}
