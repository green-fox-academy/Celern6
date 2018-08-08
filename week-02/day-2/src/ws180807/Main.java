package ws180807;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
	// write your code here
    ArrayList<Integer> list = new ArrayList<>();
    list.add(20);
    list.add(30);
    System.out.println(list);

    for (int i =0; i < list.size(); i++){
      list.set(i,list.get(i) + 2);
      }
      System.out.println(list);
    }
}

