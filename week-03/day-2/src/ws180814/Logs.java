package ws180814;

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) throws IOException {
    String datapath = "logs.txt";
    System.out.println(ipFinder("logs.txt"));
    System.out.println(gpratio("logs.txt"));
  }

  public static ArrayList<String> ipFinder(String path) throws IOException {
    Path filepath = Paths.get(path);
    List<String> lines = Files.readAllLines(filepath);
    ArrayList<String> uniqueip = new ArrayList<>();
    for (String i : lines) {
      String[] sor = i.split("   ");
      if (uniqueip.contains(sor[1])) {
      } else {
        uniqueip.add(sor[1]);
      }
    }
    return uniqueip;
  }

  public static double gpratio(String path) throws IOException {
    Path filepath = Paths.get(path);
    List<String> lines = Files.readAllLines(filepath);
    ArrayList<String> uniqueip = new ArrayList<>();
    double GET = 0;
    double POST = 0;
    for (String i : lines) {
      String[] sor = i.split("   ");
      if (sor[2].equals("GET /")) {
        GET += 1;
      } else {
        POST += 1;
      }
    }
    return GET/POST;
  }
}
