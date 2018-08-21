package gardapp;

import java.util.ArrayList;

public class Garden {
  String name;
  ArrayList<Flower> Flowers;
  ArrayList<Tree> Trees;

  public void addFlower(Flower flower){
    Flowers.add(flower);
  }
  public void addTree (Tree tree){
    Trees.add(tree);
  }




}
