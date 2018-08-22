package gardapp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      Plants blueflower = new Flower("Blue");
      Plants yellowflower = new Flower("Yellow");
      Plants orangetree = new Tree("Orange");
      Plants purpletree = new Tree("Purple");

      Garden kertem = new Garden();
      kertem.addFlower(blueflower);
      kertem.addFlower(yellowflower);
      kertem.addTree(orangetree);
      kertem.addTree(purpletree);

    }
}
