package charsequence;

public class Gnirts implements CharSequence {
  String x;

  public Gnirts(String x){
    this.x = x;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return x.charAt(x.length()-1-index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
