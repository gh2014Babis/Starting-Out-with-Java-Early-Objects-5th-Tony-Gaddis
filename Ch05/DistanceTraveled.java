
public class DistanceTraveled {
	
	private int speed;
	private int time;
	
	public DistanceTraveled(int speed, int time) {
		this.speed = speed;
		this.time = time;
	}
	
	public int getDistance() {
		return speed * time;
	}
}
