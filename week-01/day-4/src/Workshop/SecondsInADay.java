package Workshop;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    System.out.println((86400-currentHours*3600)+(3600-currentMinutes*60)+(60-currentSeconds));
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
  }
}
