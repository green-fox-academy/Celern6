import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

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
    if (fileReader().size() > 0){
      for (String oneElement : fileReader()) {
        System.out.println(i + " - " + oneElement);
        i++;
      }
    } else if (fileReader().size() == 0){
      System.out.println("No todos for today! :)");
    }
  }

  public void addToList (String addedtask) throws IOException {
    List<String> templist = new ArrayList<>();
    templist.add("[ ] " + addedtask);
    fileAppender(templist);
  }

  public void removeFromList (String tasknumberinstring) throws IOException {
    Integer tasknumber = Integer.parseInt(tasknumberinstring);
    List<String> templist = fileReader();
    templist.remove(tasknumber-1);
    fileOverwriter(templist);
  }

  //public void checkingTask ();


}
