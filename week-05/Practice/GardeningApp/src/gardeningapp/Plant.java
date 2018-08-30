package gardeningapp;

public abstract class Plant {
  public String name;
  public String color;
  public double waterlvl = 0;
  public double waterneed = 0;
  public double absorb = 1;

  public Plant (String color){
    this.color = color;
  }

  public void watering (double amount){
    waterlvl += amount*absorb;
  }

  public void getstatus () {
    if (waterlvl < waterneed) {
      System.out.println(color + " " + name + " needs water");
    } else {
      System.out.println(color + " " + name + " doesnt need water");
    }
  }

  public abstract void grow();


}


