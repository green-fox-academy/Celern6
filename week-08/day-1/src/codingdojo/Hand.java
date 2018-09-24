package codingdojo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Hand {

  Card [] hand = new Card[5];


  public Hand (String input){
    String [] inputarray = input.split(" ");
    for (int i = 0; i < inputarray.length; i++) {
      hand [i] = new Card(inputarray[i]);
    }
  }

  public Card [] getHand (){
    return this.hand;
  }

  public boolean isRoyal() {
    List<Integer> templist = Arrays.asList(10, 11, 12, 13, 14);
    for (int i = 0; i < hand.length; i++) {
      if (!hand [0].getColor().equals(hand [i].getColor())){
        return false;
      } else {
        if (!templist.contains(hand [i].getValue())){
          return false;
        }
      }
    }
    return true;
  }

//  public int handValueChecker(){
//    if ()
//  }

//  public boolean
}
