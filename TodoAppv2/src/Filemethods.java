import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Filemethods {

  public List<String> fileReader() throws IOException {
    Path filepath = Paths.get("List.txt");
    return Files.readAllLines(filepath);
  }

}
