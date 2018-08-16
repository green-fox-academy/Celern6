package diceset;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
      DiceSet diceSet = new DiceSet();
      diceSet.roll();
      System.out.println(Arrays.toString(diceSet.getCurrent()));
      while (diceSet.getCurrent()
      ) {
        diceSet.reroll();
        System.out.println(Arrays.toString(diceSet.getCurrent()));
      }
    }
}
