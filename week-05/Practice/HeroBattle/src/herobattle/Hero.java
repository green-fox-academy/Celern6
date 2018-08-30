package herobattle;

public class Hero extends BaseHero implements Punchable {

  public double motivation;

  public Hero(String name, double motivation) {
    super(name);
    this.motivation = motivation;
  }

  @Override
  public void punch(Punchable other) {
    if (getMotivationLevel() >= 1)
      other.bePunched(motivation/1.5);
  }

  @Override
  public int getMotivationLevel() {
    int motlevel = 0;
    if (motivation < 25) {
      motlevel = 0;
    }
    if (motivation > 25 && motivation <= 40){
      motlevel = 1;
    }
    if (motivation > 40){
      motlevel = 2;
    }
    return motlevel;
  }

  @Override
  public void bePunched(double damage) {
    motivation = motivation - (damage / motivation);
  }


  @Override
  public String toString(){
    String ismotivated = null;
    if (getMotivationLevel() == 0){
      ismotivated = getName() + " is not motivated anymore.";
    }
    if (getMotivationLevel() == 1) {
      ismotivated = getName() + " is motivated.";
    }
    if (getMotivationLevel() == 2) {
      ismotivated = getName() + " is well motivated.";
    }
    return ismotivated;
  }
}
