import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

      ToDo mytoDo = new ToDo();

      if (args.length == 0){
        mytoDo.noArgs();
      } else {

        if (args[0].equals("-l")){
          mytoDo.listing();
        }

        if (args[0].equals("-a")){
          if(args.length < 2.){
            System.out.println("Unable to add: no task provided.");
            } else {
            mytoDo.addToList(args[1]);
          }
        }

        if (args[0].equals("-r")) {
          tryParse(args[1]);
          if (args.length < 2.) {
            System.out.println("Unable to remove: no index provided.");
          } else if (Integer.parseInt(args[1]) > args.length){
            System.out.println("Unable to remove: index is out of bond.");
          } else {
            mytoDo.removeFromList(args[1]);
          }
        }
      }
    }

    public static Integer tryParse(String text) {
      try {
        return Integer.parseInt(text);
      } catch (NumberFormatException e) {
        System.out.println("Unable to remove: index is not a number");
        return null;
      }
    }
}

