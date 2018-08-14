package ws180814;

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String datapath = "my-file.txt";
    String szo = "alma";
    Integer szam = 6;

    writer(datapath, szo, szam);
  }
  public static void writer (String path, String line, int linenum){
    Path filepath = Paths.get(path);
    List<String> text = new ArrayList<String>();
    for (int i = 1; i <= linenum; i++){
      text.add(line);
    }
    try{
      Files.write(filepath, text);
      } catch (Exception e){

    }


  }
}
