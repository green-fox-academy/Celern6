package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
      System.out.println(dominoes.get(0).getValues()[1]);
      System.out.println(dominoes);
      System.out.println(arrangedominoes(dominoes));

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
    static List<Domino> arrangedominoes(List<Domino> indominoes){
      List<Domino> fixeddominoes = new ArrayList<>();
      fixeddominoes.add(indominoes.get(0));
      Integer j = 0;
      while (fixeddominoes.size() < indominoes.size()){
        for(int i = 0; i < indominoes.size(); i++){
          if (fixeddominoes.get(j).getValues()[1] == indominoes.get(i).getValues()[0]) {
          fixeddominoes.add(indominoes.get(i));
          j++;
          }
        }
      }
      return fixeddominoes;
    }
}