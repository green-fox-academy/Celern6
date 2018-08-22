package main.java.music;

public abstract class StringedInstrument extends Instrument{
  int numberOfstrings;

  public String sound(){
    return voice;
  }

  public void play(){
    System.out.println(instname + ", a " + numberOfstrings + " stringed instrument, that goes " + sound());
  }
}
