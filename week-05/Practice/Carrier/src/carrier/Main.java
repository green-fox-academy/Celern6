package carrier;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Carrier carrier = new Carrier(50);
      for (int i = 0; i < 6; i++) {
        carrier.addAircraft();
      }
      carrier.fill();
      carrier.getStatus();
    }
}
