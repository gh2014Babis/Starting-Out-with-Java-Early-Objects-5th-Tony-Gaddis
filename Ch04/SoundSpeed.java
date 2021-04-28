
public class SoundSpeed {
	
	private static final double SPEED_IN_AIR = 1100;
	private static final double SPEED_IN_WATER = 4900;
	private static final double SPEED_IN_STEEL = 16400;
	
	private double distance;
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public double getSpeedInAir() {
		return distance / SPEED_IN_AIR;
	}
	
	public double getSpeedInWater() {
		return distance / SPEED_IN_WATER;
	}
	
	public double getSpeedInSteel() {
		return distance / SPEED_IN_STEEL;
	}
}
