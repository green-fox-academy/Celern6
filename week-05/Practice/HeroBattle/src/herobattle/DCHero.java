package herobattle;

public class DCHero extends Hero {

  public DCHero(String name, double motivation) {
    super(name, motivation);
  }

  public DCHero(String name) {
    super(name, 45);
  }
  @Override
  public void punch(Punchable other) {
    if (other instanceof DCHero == false) {
      super.punch(other);
    }
  }
}
