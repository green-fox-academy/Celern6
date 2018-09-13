import java.io.IOException;

public class ToDo extends Filemethods{

  public ToDo(){};

  public void noArgs(){
    System.out.println(
    "Command Line ToDo application\n" +
    "=============================\n" +
    "Command line arguments:\n" +
    "-l List all the tasks\n" +
    "-a Adds a new task\n" +
    "-r Remove a task\n" +
    "-c Complete a task"
    );
  }

  public void listing() throws IOException {
    int i = 1;
    for (String oneElement : fileReader()) {
      System.out.println(i + " - " + oneElement);
      i++;
    }
  }
}
