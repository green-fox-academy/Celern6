package phamedproject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
      System.out.println(wordChecker(wordCounter(filereader("Love.txt")), 5));
    }

    public static List<String> filereader(String filename){
      try {
        Path filepath = Paths.get(filename);
        List<String> poem = Files.readAllLines(filepath);
        return poem;
      } catch (Exception e) {
        System.out.println("Cannot read file.");
      }
      return null;
    }

    public static Map<Integer, Integer> wordCounter (List<String> list){
      Map<Integer, Integer> charmap = new HashMap<>();
      for (String line : list) {
        String [] oneLine = line.split(" ");
        for (int i = 0; i < oneLine.length; i++){
          if (!charmap.containsKey(oneLine [i].length())){
            charmap.put(oneLine [i].length(), 1);
          } else if (charmap.containsKey(oneLine [i].length())){
            charmap.put(oneLine [i].length(), charmap.get(oneLine [i].length())+1);
          }
        }
      }
      return charmap;
    }

    public static int wordChecker (Map <Integer, Integer> inputmap, int charcount){
      for (Map.Entry<Integer, Integer> entry : inputmap.entrySet()){
        if (charcount == entry.getKey()){
          return entry.getValue();
        }
      }
      return 0;
    }
}
