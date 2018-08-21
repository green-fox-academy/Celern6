package gardapp;

public class Plants {
  double waterlevel;
  String color;
  double needs;

  public Plants(double waterlevel, String color, double needs){
    this.waterlevel = waterlevel;
    this.color = color;
  }
  public double watering (){
    waterlevel += 40;
    return waterlevel;
  }

  public void getColor(){
    System.out.println(color);
  }
  public void getWaterlevel (){
    if (waterlevel > needs){
      System.out.println("needs water.");
    } else {
      System.out.println("doesn't need water");
    }

  }

}
