package codingdojo;

import java.util.HashMap;
import java.util.Map;

public class Card {

  int value;
  String color;

  public Card(String oneCard){
    this.value = countValue(oneCard);
    this.color = oneCard.split("")[1];
  }

  public static Map<String, Integer> cardValuesMAp() {
    Map<String, Integer> values = new HashMap<>();
    values.put("2", 2);
    values.put("3", 3);
    values.put("4", 4);
    values.put("5", 5);
    values.put("6", 6);
    values.put("7", 7);
    values.put("8", 8);
    values.put("9", 9);
    values.put("T", 10);
    values.put("J", 11);
    values.put("Q", 12);
    values.put("K", 13);
    values.put("A", 14);
    return values;
  }

  public int countValue(String oneCard) {
    String valueToCount = oneCard.split("")[0];
    return cardValuesMap().get(valueToCount);
  }

  public int getValue() {
    return value;
  }

  public String getColor() {
    return color;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString (){
    return value+color;
  }


}
