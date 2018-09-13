import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
      ToDo mytoDo = new ToDo();

      if (args.length == 0){
        mytoDo.noArgs();
      }

      if (args[0].equals("-l")){
        mytoDo.listing();
      }
    }
}
