package ws180814;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

// Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

  public class WriteSingleLine{
    public static void main(String[] args) {
      Path filePath = Paths.get("my-file.txt");
      List<String> content = new ArrayList<>();
      content.add("My first line.");
      try {
        Files.write(filePath, content);
      } catch (Exception e) {
        System.out.println("Unable to write file: my-file.txt");
      }
    }
  }