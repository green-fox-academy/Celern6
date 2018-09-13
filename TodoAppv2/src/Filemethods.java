import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class Filemethods {

  public List<String> fileReader() throws IOException {
    Path filepath = Paths.get("List.txt");
    return Files.readAllLines(filepath);
  }

  public void fileAppender (List<String> inputlist) throws IOException {
    Path filepath = Paths.get("List.txt");
    Files.write(filepath, inputlist, APPEND);
  }

  public void fileOverwriter (List<String> inputlist) throws IOException {
    Path filepath = Paths.get("List.txt");
    Files.write(filepath, inputlist);
  }

}
