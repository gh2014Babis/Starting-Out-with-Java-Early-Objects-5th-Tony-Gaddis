
public class FuelGauge {
	
	private double fuelAmount;
	
	public FuelGauge(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	
	public double getFuelAmount() {
		return fuelAmount;
	}
	
	public void increment() {
		if (fuelAmount < 15)
			fuelAmount++;
	}
	
	public void decrement() {
		if (fuelAmount > 0)
			fuelAmount--;
	}
}