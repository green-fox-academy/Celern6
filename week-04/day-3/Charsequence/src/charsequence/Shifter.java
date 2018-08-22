package charsequence;

public class Shifter implements CharSequence {
  String x;
  int a;

  public Shifter(String x, int a){
    this.x = x;
    this.a = a;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return x.charAt(index+a);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
