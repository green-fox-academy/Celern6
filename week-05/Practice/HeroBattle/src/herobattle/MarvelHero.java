package herobattle;

public class MarvelHero extends Hero {

  public MarvelHero(String name, double motivation) {
    super(name, motivation);
  }

  public MarvelHero(String name) {
    super(name, 40);
  }
  @Override
  public void punch(Punchable other) {
    if (other instanceof MarvelHero == false) {
      super.punch(other);
    }
  }

}
