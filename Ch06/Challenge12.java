
public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odometer od = new Odometer(345000);
		FuelGauge fg = new FuelGauge(13);
		while (fg.getFuelAmount() > 0) {
			od.increment();
			od.decrementFuel(fg);
			System.out.println(od.getMileAge());
			System.out.println(fg.getFuelAmount());
		}
	}
}
