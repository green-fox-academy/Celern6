package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(){
    instname = "Electric Guiter";
    numberOfstrings = 6;
    voice = "Twang";
  }
  public ElectricGuitar(int x){
    instname = "Electric Guitar";
    numberOfstrings = x;
    voice = "Twang";
  }
}
