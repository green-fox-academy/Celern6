package diceset;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
      DiceSet diceSet = new DiceSet();
      diceSet.roll();
      System.out.println(Arrays.toString(diceSet.getCurrent()));
      while (diceSet.getCurrent()[0] == 6
              && diceSet.getCurrent()[1] == 6
              && diceSet.getCurrent()[2] == 6
              && diceSet.getCurrent()[3] == 6
              && diceSet.getCurrent()[4] == 6
              && diceSet.getCurrent()[5] == 6
      ) {
        diceSet.reroll();
        System.out.println(Arrays.toString(diceSet.getCurrent()));
      }
    }
}
