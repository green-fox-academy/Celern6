package carrier;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Carrier carrier = new Carrier(2300);
      Carrier hostilecarrier = new Carrier(2300);
      for (int i = 0; i < 6; i++) {
        carrier.addAircraft();
      }
      carrier.fill();
      carrier.getStatus();
      carrier.fight(hostilecarrier);
      carrier.getStatus();
      hostilecarrier.getStatus();
    }
}
