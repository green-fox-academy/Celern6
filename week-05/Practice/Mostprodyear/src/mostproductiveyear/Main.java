package mostproductiveyear;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    getbestyears("Paramount.csv");
  }

  public static void getbestyears(String filename) throws IOException {
    List<String> data;
    Map<String, Integer> years = new HashMap<>();
    try {
      Path filepath = Paths.get(filename);
      data = Files.readAllLines(filepath);
      for (String line : data) {
        String [] oneLine = line.split(",");
        if (!years.containsKey(oneLine [1])){
          years.put(oneLine [1], 1);
          } else if (years.containsKey(oneLine [1])) {
          years.put(oneLine [1], years.get(oneLine [1]) + 1);
          }
        }
      int maxvalue = Collections.max(years.values());
      for (Map.Entry<String, Integer> entry : years.entrySet()) {
        if (entry.getValue() == maxvalue){
          System.out.println("The best year for the studio was " + entry.getKey());
        }
      }
      } catch (Exception e) {
      System.out.println("Cannot find studio, please try again later.");
    }
  }
}
