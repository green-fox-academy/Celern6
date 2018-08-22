package main.java.music;

public class Violin extends StringedInstrument{

  public Violin(){
    instname = "Violin";
    numberOfstrings = 4;
    voice = "Screech";
  }
  public Violin(int x){
    instname = "Violin";
    numberOfstrings = x;
    voice = "Screech";
  }
}
