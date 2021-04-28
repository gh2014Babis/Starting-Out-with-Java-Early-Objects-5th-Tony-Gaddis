
public class Odometer {
	
	private double mileAge;
	
	public Odometer(double mileAge) {
		this.mileAge = mileAge;
	}
	
	public double getMileAge() {
		return mileAge;
	}
	
	public void increment() {
		mileAge++;
		if (mileAge > 999999)
			mileAge = 0;
	}
	
	public void decrementFuel(FuelGauge obj) {
		if (mileAge % 24 == 0)
			obj.decrement();
	}
}
